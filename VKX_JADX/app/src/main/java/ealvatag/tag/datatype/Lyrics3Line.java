package ealvatag.tag.datatype;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12379l;
import defpackage.AbstractC16446l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC5020l;
import defpackage.C0869l;
import defpackage.C11983l;
import defpackage.C6541l;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class Lyrics3Line extends AbstractDataType {
    private String lyric;
    private LinkedList<Lyrics3TimeStamp> timeStamp;

    public Lyrics3Line(Lyrics3Line lyrics3Line) {
        super(lyrics3Line);
        this.timeStamp = new LinkedList<>();
        this.lyric = "";
        this.lyric = lyrics3Line.lyric;
        for (int i = 0; i < lyrics3Line.timeStamp.size(); i++) {
            this.timeStamp.add(new Lyrics3TimeStamp(lyrics3Line.timeStamp.get(i)));
        }
    }

    public void addLyric(ID3v2LyricLine iD3v2LyricLine) {
        this.lyric += iD3v2LyricLine.getText();
    }

    public void addTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.timeStamp.add(lyrics3TimeStamp);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3Line)) {
            return false;
        }
        Lyrics3Line lyrics3Line = (Lyrics3Line) obj;
        return this.lyric.equals(lyrics3Line.lyric) && this.timeStamp.equals(lyrics3Line.timeStamp) && super.equals(obj);
    }

    public String getLyric() {
        return this.lyric;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Iterator<Lyrics3TimeStamp> it = this.timeStamp.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return this.lyric.length() + size;
    }

    public Iterator<Lyrics3TimeStamp> getTimeStamp() {
        return this.timeStamp.iterator();
    }

    public boolean hasTimeStamp() {
        return !this.timeStamp.isEmpty();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C0869l c0869l, int i) {
        readString(c0869l.m725package(c0869l.f2526l).toString(), 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        readString(bArr.toString(), i);
    }

    public void readString(String str, int i) {
        if (str == null) {
            C6541l.subs("Image is null");
            return;
        }
        if (i < 0 || i >= str.length()) {
            C11983l.mopub(str.length(), AbstractC2812l.Signature("Offset to line is out of bounds: offset = ", i, ", line.length()"));
            return;
        }
        this.timeStamp = new LinkedList<>();
        int iIndexOf = str.indexOf("[", i);
        while (iIndexOf >= 0) {
            i = str.indexOf("]", iIndexOf) + 1;
            Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
            lyrics3TimeStamp.readString();
            this.timeStamp.add(lyrics3TimeStamp);
            iIndexOf = str.indexOf("[", i);
        }
        this.lyric = str.substring(i);
    }

    public void setLyric(ID3v2LyricLine iD3v2LyricLine) {
        this.lyric = iD3v2LyricLine.getText();
    }

    public void setTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.timeStamp.clear();
        this.timeStamp.add(lyrics3TimeStamp);
    }

    public String toString() {
        String string = "";
        for (Lyrics3TimeStamp lyrics3TimeStamp : this.timeStamp) {
            StringBuilder sbAd = AbstractC5020l.ad(string);
            sbAd.append(lyrics3TimeStamp.toString());
            string = sbAd.toString();
        }
        return AbstractC0653l.ads(AbstractC5020l.isVip("timeStamp = ", string, ", lyric = "), this.lyric, "\n");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC12379l.loadAd);
    }

    public String writeString() {
        String string = "";
        for (Lyrics3TimeStamp lyrics3TimeStamp : this.timeStamp) {
            StringBuilder sbAd = AbstractC5020l.ad(string);
            sbAd.append(lyrics3TimeStamp.writeString());
            string = sbAd.toString();
        }
        StringBuilder sbAd2 = AbstractC5020l.ad(string);
        sbAd2.append(this.lyric);
        return sbAd2.toString();
    }

    public void setLyric(String str) {
        this.lyric = str;
    }

    public void addLyric(String str) {
        this.lyric = AbstractC0653l.ads(new StringBuilder(), this.lyric, str);
    }

    public Lyrics3Line(String str, AbstractC16446l abstractC16446l) {
        super(str, abstractC16446l);
        this.timeStamp = new LinkedList<>();
        this.lyric = "";
    }
}
