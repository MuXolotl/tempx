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
import ealvatag.tag.datatype.EventTimingCode;
import ealvatag.tag.datatype.EventTimingCodeList;
import ealvatag.tag.datatype.NumberHashMap;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyETCO extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final InterfaceC15756l LOG;
    public static final int MILLISECONDS = 2;
    public static final int MPEG_FRAMES = 1;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
    }

    public FrameBodyETCO() {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, 2);
    }

    private void resolveRelativeTimestamps() {
        long timestamp = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                timestamp = eventTimingCode.getTimestamp();
            }
            eventTimingCode.setTimestamp(timestamp);
        }
    }

    private static Set<Integer> toSet(int... iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    public void addTimingCode(long j, int... iArr) {
        int i;
        List<EventTimingCode> list = (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST);
        if (list.isEmpty() || ((EventTimingCode) list.get(0)).getTimestamp() > j) {
            i = 0;
        } else {
            i = 0;
            long timestamp = 0;
            for (EventTimingCode eventTimingCode : list) {
                if (eventTimingCode.getTimestamp() != 0) {
                    timestamp = eventTimingCode.getTimestamp();
                }
                if (j < timestamp) {
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = i;
        for (int i3 : iArr) {
            list.add(i2, new EventTimingCode(DataTypes.OBJ_TIMED_EVENT, this, i3, j));
            i2++;
        }
    }

    public void clearTimingCodes() {
        ((List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)).clear();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ETCO";
    }

    public int getTimestampFormat() {
        return ((Number) getObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT)).intValue();
    }

    public List<Long> getTimestamps(int... iArr) {
        Set<Integer> set = toSet(iArr);
        ArrayList arrayList = new ArrayList();
        long timestamp = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                timestamp = eventTimingCode.getTimestamp();
            }
            if (set.contains(Integer.valueOf(eventTimingCode.getType()))) {
                arrayList.add(Long.valueOf(timestamp));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Map<Long, int[]> getTimingCodes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long timestamp = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                timestamp = eventTimingCode.getTimestamp();
            }
            int[] iArr = (int[]) linkedHashMap.get(Long.valueOf(timestamp));
            if (iArr == null) {
                linkedHashMap.put(Long.valueOf(timestamp), new int[]{eventTimingCode.getType()});
            } else {
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iArr2[length] = eventTimingCode.getType();
                linkedHashMap.put(Long.valueOf(timestamp), iArr2);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC18219l
    public void read(ByteBuffer byteBuffer) throws C5299l, C11399l {
        super.read(byteBuffer);
        long j = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            long timestamp = eventTimingCode.getTimestamp() == 0 ? j : eventTimingCode.getTimestamp();
            if (eventTimingCode.getTimestamp() < j) {
                InterfaceC15756l interfaceC15756l = LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                eventTimingCode.getTimestamp();
                ((C13975l) interfaceC15756l).getClass();
                int i = C17500l.yandex;
            }
            j = timestamp;
        }
    }

    public boolean removeTimingCode(long j, int... iArr) {
        resolveRelativeTimestamps();
        Set<Integer> set = toSet(iArr);
        ListIterator listIterator = ((List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)).listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            EventTimingCode eventTimingCode = (EventTimingCode) listIterator.next();
            if (j == eventTimingCode.getTimestamp() && set.contains(Integer.valueOf(eventTimingCode.getType()))) {
                listIterator.remove();
                z = true;
            }
            if (j > eventTimingCode.getTimestamp()) {
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
        addDataType(new EventTimingCodeList(this));
    }

    public FrameBodyETCO(FrameBodyETCO frameBodyETCO) {
        super(frameBodyETCO);
    }

    public FrameBodyETCO(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyETCO(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
