package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
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
public class Lyrics3Image extends AbstractDataType {
    private String description;
    private String filename;
    private Lyrics3TimeStamp time;

    public Lyrics3Image(Lyrics3Image lyrics3Image) {
        super(lyrics3Image);
        this.time = null;
        this.description = "";
        this.filename = "";
        this.time = new Lyrics3TimeStamp(lyrics3Image.time);
        this.description = lyrics3Image.description;
        this.filename = lyrics3Image.filename;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3Image)) {
            return false;
        }
        Lyrics3Image lyrics3Image = (Lyrics3Image) obj;
        if (!this.description.equals(lyrics3Image.description) || !this.filename.equals(lyrics3Image.filename)) {
            return false;
        }
        Lyrics3TimeStamp lyrics3TimeStamp = this.time;
        Lyrics3TimeStamp lyrics3TimeStamp2 = lyrics3Image.time;
        if (lyrics3TimeStamp == null) {
            if (lyrics3TimeStamp2 != null) {
                return false;
            }
        } else if (!lyrics3TimeStamp.equals(lyrics3TimeStamp2)) {
            return false;
        }
        return super.equals(obj);
    }

    public String getDescription() {
        return this.description;
    }

    public String getFilename() {
        return this.filename;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        int length = this.description.length() + this.filename.length() + 2 + 2;
        Lyrics3TimeStamp lyrics3TimeStamp = this.time;
        return lyrics3TimeStamp != null ? lyrics3TimeStamp.getSize() + length : length;
    }

    public Lyrics3TimeStamp getTimeStamp() {
        return this.time;
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
            C6541l.subs("Image string is null");
            return;
        }
        if (i < 0 || i >= str.length()) {
            C11983l.mopub(str.length(), AbstractC2812l.Signature("Offset to image string is out of bounds: offset = ", i, ", string.length()"));
            return;
        }
        int iIndexOf = str.indexOf("||", i);
        this.filename = str.substring(i, iIndexOf);
        int i2 = iIndexOf + 2;
        int iIndexOf2 = str.indexOf("||", i2);
        this.description = str.substring(i2, iIndexOf2);
        if (str.substring(iIndexOf2 + 2).length() == 7) {
            Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
            this.time = lyrics3TimeStamp;
            lyrics3TimeStamp.readString();
        }
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.time = lyrics3TimeStamp;
    }

    public String toString() {
        String string = "filename = " + this.filename + ", description = " + this.description;
        if (this.time != null) {
            StringBuilder sbAdvert = AbstractC5020l.advert(string, ", timestamp = ");
            sbAdvert.append(this.time.toString());
            string = sbAdvert.toString();
        }
        return string.concat("\n");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC12379l.loadAd);
    }

    public String writeString() {
        String strAds = this.filename == null ? "||" : AbstractC0653l.ads(new StringBuilder(), this.filename, "||");
        String strConcat = this.description == null ? strAds.concat("||") : AbstractC0653l.ads(AbstractC5020l.ad(strAds), this.description, "||");
        if (this.time == null) {
            return strConcat;
        }
        StringBuilder sbAd = AbstractC5020l.ad(strConcat);
        sbAd.append(this.time.writeString());
        return sbAd.toString();
    }

    public Lyrics3Image(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.time = null;
        this.description = "";
        this.filename = "";
    }
}
