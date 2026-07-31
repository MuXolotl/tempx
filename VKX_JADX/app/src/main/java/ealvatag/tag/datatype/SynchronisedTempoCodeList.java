package ealvatag.tag.datatype;

import ealvatag.tag.id3.framebody.FrameBodySYTC;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class SynchronisedTempoCodeList extends AbstractDataTypeList<SynchronisedTempoCode> {
    public SynchronisedTempoCodeList(FrameBodySYTC frameBodySYTC) {
        super(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST, frameBodySYTC);
    }

    @Override // ealvatag.tag.datatype.AbstractDataTypeList
    public SynchronisedTempoCode createListElement() {
        return new SynchronisedTempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO, this.frameBody);
    }

    public SynchronisedTempoCodeList(SynchronisedTempoCodeList synchronisedTempoCodeList) {
        super(synchronisedTempoCodeList);
    }
}
