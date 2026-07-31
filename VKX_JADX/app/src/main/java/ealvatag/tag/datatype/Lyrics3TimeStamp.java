package ealvatag.tag.datatype;

import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC5020l;
import defpackage.C0869l;
import defpackage.C11983l;
import defpackage.C6541l;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class Lyrics3TimeStamp extends AbstractDataType {
    private long minute;
    private long second;

    public Lyrics3TimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        super(lyrics3TimeStamp);
        this.minute = 0L;
        this.second = 0L;
        this.minute = lyrics3TimeStamp.minute;
        this.second = lyrics3TimeStamp.second;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3TimeStamp)) {
            return false;
        }
        Lyrics3TimeStamp lyrics3TimeStamp = (Lyrics3TimeStamp) obj;
        return this.minute == lyrics3TimeStamp.minute && this.second == lyrics3TimeStamp.second && super.equals(obj);
    }

    public long getMinute() {
        return this.minute;
    }

    public long getSecond() {
        return this.second;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 7;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        readString(Arrays.toString(c0869l.m725package(c0869l.f2526l)), 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        readString(Arrays.toString(bArr), i);
    }

    public void readString(String str, int i) {
        if (str == null) {
            C6541l.subs("Image is null");
            return;
        }
        if (i < 0 || i >= str.length()) {
            C11983l.mopub(str.length(), AbstractC2812l.Signature("Offset to timeStamp is out of bounds: offset = ", i, ", timeStamp.length()"));
            return;
        }
        String strSubstring = str.substring(i);
        if (strSubstring.length() == 7) {
            this.minute = Integer.parseInt(strSubstring.substring(1, 3));
            this.second = Integer.parseInt(strSubstring.substring(4, 6));
        } else {
            this.minute = 0L;
            this.second = 0L;
        }
    }

    public void setMinute(long j) {
        this.minute = j;
    }

    public void setSecond(long j) {
        this.second = j;
    }

    public void setTimeStamp(long j, byte b) {
        long j2 = j / 1000;
        this.minute = j2 / 60;
        this.second = j2 % 60;
    }

    public String toString() {
        return writeString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC12379l.loadAd);
    }

    public String writeString() {
        String string;
        String string2;
        long j = this.minute;
        if (j < 0) {
            string = "[00";
        } else {
            StringBuilder sbAd = AbstractC5020l.ad(j < 10 ? "[0" : "[");
            sbAd.append(Long.toString(this.minute));
            string = sbAd.toString();
        }
        String strConcat = string.concat(":");
        long j2 = this.second;
        if (j2 < 0) {
            string2 = strConcat.concat("00");
        } else {
            if (j2 < 10) {
                strConcat = strConcat.concat("0");
            }
            StringBuilder sbAd2 = AbstractC5020l.ad(strConcat);
            sbAd2.append(Long.toString(this.second));
            string2 = sbAd2.toString();
        }
        return string2.concat("]");
    }

    public Lyrics3TimeStamp(String str) {
        super(str, null);
        this.minute = 0L;
        this.second = 0L;
    }

    public Lyrics3TimeStamp(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.minute = 0L;
        this.second = 0L;
    }

    public void readString() {
    }
}
