package org.bigant.wf.form;

import org.bigant.wf.form.bean.*;

public interface FormService {

    FormDetail save(FormSave formSave);

    FormDetail update(FormUpdate formUpdate);

    boolean delete(String code);

    FormDetail detail(String code);


    void saveData(FormDataSave formDataSave);

    void updateData(FormDataUpdate formDataUpdate);

    void removeData(Long id);

    void detailData(Long id);
}
