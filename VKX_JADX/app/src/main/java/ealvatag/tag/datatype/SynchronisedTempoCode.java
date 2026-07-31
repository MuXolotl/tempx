package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
import defpackage.AbstractC16446l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.C5299l;
import defpackage.C6180l;
import defpackage.C8339l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class SynchronisedTempoCode extends AbstractDataType implements Cloneable {
    private TempoCode tempo;
    private NumberFixedLength timestamp;

    private SynchronisedTempoCode(SynchronisedTempoCode synchronisedTempoCode) {
        super(synchronisedTempoCode);
        this.tempo = new TempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO_DATA, null, 1);
        this.timestamp = new NumberFixedLength(DataTypes.OBJ_DATETIME, null, 4);
        this.tempo.setValue(synchronisedTempoCode.tempo.getValue());
        this.timestamp.setValue(synchronisedTempoCode.timestamp.getValue());
    }

    public Object clone() {
        return new SynchronisedTempoCode(this);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SynchronisedTempoCode synchronisedTempoCode = (SynchronisedTempoCode) obj;
        return getTempo() == synchronisedTempoCode.getTempo() && getTimestamp() == synchronisedTempoCode.getTimestamp();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.timestamp.getSize() + this.tempo.getSize();
    }

    public int getTempo() {
        return ((Number) this.tempo.getValue()).intValue();
    }

    public long getTimestamp() {
        return ((Number) this.timestamp.getValue()).longValue();
    }

    public int hashCode() {
        TempoCode tempoCode = this.tempo;
        int iHashCode = (tempoCode != null ? tempoCode.hashCode() : 0) * 31;
        NumberFixedLength numberFixedLength = this.timestamp;
        return iHashCode + (numberFixedLength != null ? numberFixedLength.hashCode() : 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        this.tempo.read(c0869l, i);
        this.timestamp.read(c0869l, i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) throws C5299l {
        int size = getSize();
        InterfaceC15756l interfaceC15756l = AbstractDataType.LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        if (i > bArr.length - size) {
            ((C13975l) AbstractDataType.LOG).getClass();
            throw new C5299l("Invalid size for FrameBody");
        }
        this.tempo.readByteArray(bArr, i);
        this.timestamp.readByteArray(bArr, this.tempo.getSize() + i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setBody(AbstractC16446l abstractC16446l) {
        super.setBody(abstractC16446l);
        this.tempo.setBody(abstractC16446l);
        this.timestamp.setBody(abstractC16446l);
    }

    public void setTempo(int i) {
        if (i < 0 || i > 510) {
            C8339l.metrica(AbstractC0653l.vip(i, "Tempo must be a positive value less than 511: "));
        } else {
            this.tempo.setValue(Integer.valueOf(i));
        }
    }

    public void setTimestamp(long j) {
        this.timestamp.setValue(Long.valueOf(j));
    }

    public String toString() {
        return "" + getTempo() + " (\"" + C6180l.yandex().getValue(getTempo()) + "\"), " + getTimestamp();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArrWriteByteArray = this.tempo.writeByteArray();
        byte[] bArrWriteByteArray2 = this.timestamp.writeByteArray();
        if (bArrWriteByteArray == null || bArrWriteByteArray2 == null) {
            return null;
        }
        byte[] bArr = new byte[bArrWriteByteArray.length + bArrWriteByteArray2.length];
        System.arraycopy(bArrWriteByteArray, 0, bArr, 0, bArrWriteByteArray.length);
        System.arraycopy(bArrWriteByteArray2, 0, bArr, bArrWriteByteArray.length, bArrWriteByteArray2.length);
        return bArr;
    }

    public SynchronisedTempoCode(String str, AbstractC16446l abstractC16446l) {
        this(str, abstractC16446l, 0, 0L);
    }

    public SynchronisedTempoCode(String str, AbstractC16446l abstractC16446l, int i, long j) {
        super(str, abstractC16446l);
        this.tempo = new TempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO_DATA, null, 1);
        this.timestamp = new NumberFixedLength(DataTypes.OBJ_DATETIME, null, 4);
        setBody(abstractC16446l);
        this.tempo.setValue(Integer.valueOf(i));
        this.timestamp.setValue(Long.valueOf(j));
    }
}
