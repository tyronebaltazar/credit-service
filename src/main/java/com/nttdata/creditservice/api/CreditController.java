package com.nttdata.creditservice.api;


import com.nttdata.creditservice.model.document.Credit;
import com.nttdata.creditservice.model.service.CreditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Class for CreditController.
 */
@RestController
@RequestMapping("/credits")
@Slf4j
public class CreditController {

  @Autowired
  private CreditService creditService;

  /**
   * Get list of credits.
   *
   * @param credit represents Credit
   * @return credit
   */
  @GetMapping
  public Flux<Credit> findAll(@RequestBody Credit credit) {
    Flux<Credit> response = creditService.getAll();
    log.info("findAll");
    log.debug(response.toString());
    return response;
  }

  /**
   * Create credit.
   *
   * @param credit represents Credit
   * @return credit
   */
  @PostMapping
  public Mono<Credit> create(@RequestBody Credit credit) {
    Mono<Credit> response = creditService.save(credit);
    log.info("create OK");
    log.debug(response.toString());
    return response;
  }

  /**
   * Update credit.
   *
   * @param credit represents Credit
   */
  @PutMapping
  public void update(@RequestBody Credit credit) {
    creditService.update(credit);
    log.info("update OK");
    log.debug(credit.getCreditId() + "/" + credit.toString());
  }

  /**
   * Delete credit by id.
   *
   * @param id represents creditId
   */
  @DeleteMapping({"{id}"})
  public void delete(@PathVariable("id") String id) {
    creditService.delete(id);
    log.info("delete OK");
    log.debug(id.toString());
  }

}
