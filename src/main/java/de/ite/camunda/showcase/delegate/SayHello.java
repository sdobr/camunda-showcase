package de.ite.camunda.showcase.delegate;

import de.ite.camunda.showcase.util.Util;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SayHello implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(SayHello.class);

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    Util.waitSeconds(10);
    LOGGER.info("hello {}", execution);
  }

}
