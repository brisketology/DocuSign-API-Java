package com.ds.api;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;

import com.ds.beans.Envelope;
import com.ds.beans.EnvelopeDocument;
import com.ds.beans.EnvelopeRecipientStatus;
import com.ds.beans.EnvelopeTemplate;
import com.ds.beans.Status;

public interface DS {

	public void getLoginInfo() throws JSONException, IOException;

	public ArrayList<EnvelopeTemplate> getEnvelopeTemplatesList()
			throws JSONException, IOException;

	public Status getStatus() throws JSONException, IOException;

	public Status getStatusCreatedByMe(String username, String email,
			String statuses) throws JSONException, IOException;

	public Status getStatusSinceDate(String mm_dd_yyyy, String statuses)
			throws JSONException, IOException;

	public Status getStatusSinceDate(int month, int day, int year,
			String statuses) throws JSONException, IOException;

	public Envelope getEnvelope(String envelopeId) throws JSONException,
			IOException;

	public EnvelopeRecipientStatus getEnvelopeRecipientStatus(String envelopeId)
			throws JSONException, IOException;

	public String getEnvelopeStatus(String envelopeId) throws JSONException,
			IOException;

	public ArrayList<EnvelopeDocument> getEnvelopeDocumentsList(
			String envelopeId) throws JSONException, IOException;

	public void downloadEnvelopeDocument(String envelopeId, String documentId,
			String downloadPath) throws JSONException, IOException;
}
