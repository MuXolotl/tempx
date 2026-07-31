package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.C0869l;
import defpackage.C11983l;
import defpackage.C6541l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class ID3v2LyricLine extends AbstractDataType {
    String text;
    long timeStamp;

    public ID3v2LyricLine(ID3v2LyricLine iD3v2LyricLine) {
        super(iD3v2LyricLine);
        this.text = "";
        this.timeStamp = 0L;
        this.text = iD3v2LyricLine.text;
        this.timeStamp = iD3v2LyricLine.timeStamp;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof ID3v2LyricLine)) {
            return false;
        }
        ID3v2LyricLine iD3v2LyricLine = (ID3v2LyricLine) obj;
        return this.text.equals(iD3v2LyricLine.text) && this.timeStamp == iD3v2LyricLine.timeStamp && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.text.length() + 5;
    }

    public String getText() {
        return this.text;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        this.text = c0869l.mo712l(c0869l.f2526l - 4, AbstractC12379l.loadAd);
        this.timeStamp = 0L;
        for (int i2 = 0; i2 < 4; i2++) {
            long j = this.timeStamp << 8;
            this.timeStamp = j;
            this.timeStamp = j + ((long) c0869l.readByte());
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            C6541l.subs("Byte array is null");
            return;
        }
        if (i < 0 || i >= bArr.length) {
            C11983l.mopub(bArr.length, AbstractC2812l.Signature("Offset to byte array is out of bounds: offset = ", i, ", array.length = "));
            return;
        }
        this.text = new String(bArr, i, (bArr.length - i) - 4, AbstractC12379l.loadAd);
        this.timeStamp = 0L;
        for (int length = bArr.length - 4; length < bArr.length; length++) {
            long j = this.timeStamp << 8;
            this.timeStamp = j;
            this.timeStamp = j + ((long) bArr[length]);
        }
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        return this.timeStamp + " " + this.text;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[getSize()];
        int i = 0;
        while (i < this.text.length()) {
            bArr[i] = (byte) this.text.charAt(i);
            i++;
        }
        bArr[i] = 0;
        long j = this.timeStamp;
        bArr[i + 1] = (byte) (((-16777216) & j) >> 24);
        bArr[i + 2] = (byte) ((16711680 & j) >> 16);
        bArr[i + 3] = (byte) ((65280 & j) >> 8);
        bArr[i + 4] = (byte) (j & 255);
        return bArr;
    }

    public ID3v2LyricLine(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.text = "";
        this.timeStamp = 0L;
    }
}
