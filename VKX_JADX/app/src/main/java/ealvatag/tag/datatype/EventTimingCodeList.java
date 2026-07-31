package ealvatag.tag.datatype;

import ealvatag.tag.id3.framebody.FrameBodyETCO;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class EventTimingCodeList extends AbstractDataTypeList<EventTimingCode> {
    public EventTimingCodeList(FrameBodyETCO frameBodyETCO) {
        super(DataTypes.OBJ_TIMED_EVENT_LIST, frameBodyETCO);
    }

    @Override // ealvatag.tag.datatype.AbstractDataTypeList
    public EventTimingCode createListElement() {
        return new EventTimingCode(DataTypes.OBJ_TIMED_EVENT, this.frameBody);
    }

    public EventTimingCodeList(EventTimingCodeList eventTimingCodeList) {
        super(eventTimingCodeList);
    }
}
