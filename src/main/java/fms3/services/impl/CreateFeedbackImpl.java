package fms3.services.impl;

import java.util.*;

import fms3.model.*;

import fms3.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateFeedbackImpl implements CreateFeedbackI {

	@Override
	public CreateFeedbackResponseWrapper execute(CreateFeedbackP pojo){
		//TODO
		return new CreateFeedbackResponseWrapper();
	}

	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}