package com.hubspot.slack.client.models.response;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;

import javax.annotation.Nullable;

@Immutable
@HubSpotStyle
public interface SlackErrorResponseIF extends SlackResponse {
  @Nullable  JsonNode getJson();
  Optional<SlackError> getError();
  List<SlackError> getErrors();

  /**
   * This method just gives you one
   * "primary" error, abstracting away the details that the error can be either singular or plural.
   */
  default SlackError getPrimaryError() {
    return getError().orElseGet(() -> getErrors().get(0));
  }
}
