package ealvatag.tag.id3.framebody;

import defpackage.AbstractC15690l;
import defpackage.C0869l;
import defpackage.C11399l;
import defpackage.C11570l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.SynchronisedTempoCode;
import ealvatag.tag.datatype.SynchronisedTempoCodeList;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodySYTC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final InterfaceC15756l LOG;
    public static final int MILLISECONDS = 2;
    public static final int MPEG_FRAMES = 1;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
    }

    public FrameBodySYTC(int i, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i));
        setObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST, bArr);
    }

    public void addTempo(long j, int i) {
        removeTempo(j);
        List list = (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST);
        int i2 = 0;
        if (!list.isEmpty() && ((SynchronisedTempoCode) list.get(0)).getTimestamp() <= j) {
            Iterator it = list.iterator();
            while (it.hasNext() && j >= ((SynchronisedTempoCode) it.next()).getTimestamp()) {
                i2++;
            }
        }
        list.add(i2, new SynchronisedTempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO, this, i, j));
    }

    public void clearTempi() {
        ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).clear();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SYTC";
    }

    public Map<Long, Integer> getTempi() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SynchronisedTempoCode synchronisedTempoCode : (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)) {
            linkedHashMap.put(Long.valueOf(synchronisedTempoCode.getTimestamp()), Integer.valueOf(synchronisedTempoCode.getTempo()));
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public int getTimestampFormat() {
        return ((Number) getObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT)).intValue();
    }

    public List<Long> getTimestamps() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SynchronisedTempoCode) it.next()).getTimestamp()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC18219l
    public void read(ByteBuffer byteBuffer) throws C5299l, C11399l {
        super.read(byteBuffer);
        long timestamp = 0;
        for (SynchronisedTempoCode synchronisedTempoCode : (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)) {
            if (synchronisedTempoCode.getTimestamp() < timestamp) {
                InterfaceC15756l interfaceC15756l = LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                synchronisedTempoCode.getTimestamp();
                ((C13975l) interfaceC15756l).getClass();
                int i = C17500l.yandex;
            }
            timestamp = synchronisedTempoCode.getTimestamp();
        }
    }

    public boolean removeTempo(long j) {
        ListIterator listIterator = ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            SynchronisedTempoCode synchronisedTempoCode = (SynchronisedTempoCode) listIterator.next();
            if (j == synchronisedTempoCode.getTimestamp()) {
                listIterator.remove();
                z = true;
            }
            if (j > synchronisedTempoCode.getTimestamp()) {
                break;
            }
        }
        return z;
    }

    public void setTimestampFormat(int i) {
        C11570l.yandex().getValue(i);
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i));
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new SynchronisedTempoCodeList(this));
    }

    public FrameBodySYTC() {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, 2);
    }

    public FrameBodySYTC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodySYTC(C0869l c0869l, int i) {
        super(c0869l, i);
    }

    public FrameBodySYTC(FrameBodySYTC frameBodySYTC) {
        super(frameBodySYTC);
    }
}
