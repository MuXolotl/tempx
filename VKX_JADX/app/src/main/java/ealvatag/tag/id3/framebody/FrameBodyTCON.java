package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import defpackage.C18595l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.TCONString;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTCON extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
    public FrameBodyTCON() {
    }

    private static String bracketWrap(Object obj) {
        return "(" + obj + ')';
    }

    private static String checkBracketed(String str) {
        String strReplace = str.replace("(", "").replace(")", "");
        try {
            int i = Integer.parseInt(strReplace);
            return i <= 191 ? C18595l.ads().getValue(i) : strReplace;
        } catch (NumberFormatException unused) {
            if (strReplace.equalsIgnoreCase("RX")) {
                return "Remix";
            }
            return strReplace.equalsIgnoreCase("CR") ? "Cover" : strReplace;
        }
    }

    public static String convertGenericToID3v22Genre(String str) {
        return convertGenericToID3v23Genre(str);
    }

    public static String convertGenericToID3v23Genre(String str) {
        try {
            int i = Integer.parseInt(str);
            return i <= 191 ? bracketWrap(String.valueOf(i)) : str;
        } catch (NumberFormatException unused) {
            Integer numAdcel = C18595l.ads().adcel(str);
            if (numAdcel != null && numAdcel.intValue() <= 125) {
                return bracketWrap(String.valueOf(numAdcel));
            }
            if (str.equalsIgnoreCase("Remix")) {
                return bracketWrap("RX");
            }
            if (str.equalsIgnoreCase("Cover")) {
                return bracketWrap("CR");
            }
            if (str.equalsIgnoreCase("RX")) {
                return bracketWrap("RX");
            }
            return str.equalsIgnoreCase("CR") ? bracketWrap("CR") : str;
        }
    }

    public static String convertGenericToID3v24Genre(String str) {
        try {
            int i = Integer.parseInt(str);
            return i <= 191 ? String.valueOf(i) : str;
        } catch (NumberFormatException unused) {
            Integer numAdcel = C18595l.ads().adcel(str);
            if (numAdcel != null && numAdcel.intValue() <= 125) {
                return String.valueOf(numAdcel);
            }
            if (!str.equalsIgnoreCase("Remix")) {
                if (!str.equalsIgnoreCase("Cover")) {
                    if (!str.equalsIgnoreCase("RX")) {
                        if (!str.equalsIgnoreCase("CR")) {
                            return str;
                        }
                    }
                }
                return "CR";
            }
            return "RX";
        }
    }

    public static String convertID3v22GenreToGeneric(String str) {
        return convertID3v23GenreToGeneric(str);
    }

    public static String convertID3v23GenreToGeneric(String str) {
        if (!str.contains(")") || str.lastIndexOf(41) >= str.length() - 1) {
            return checkBracketed(str);
        }
        return checkBracketed(str.substring(0, str.lastIndexOf(41))) + ' ' + str.substring(str.lastIndexOf(41) + 1);
    }

    public static String convertID3v24GenreToGeneric(String str) {
        try {
            int i = Integer.parseInt(str);
            return i <= 191 ? C18595l.ads().getValue(i) : str;
        } catch (NumberFormatException unused) {
            if (str.equalsIgnoreCase("RX")) {
                return "Remix";
            }
            return str.equalsIgnoreCase("CR") ? "Cover" : str;
        }
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TCON";
    }

    public void setV23Format() {
        ((TCONString) getObject(DataTypes.OBJ_TEXT)).setNullSeparateMultipleValues(false);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo, defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new TCONString(DataTypes.OBJ_TEXT, this));
    }

    public FrameBodyTCON(FrameBodyTCON frameBodyTCON) {
        super(frameBodyTCON);
    }

    public FrameBodyTCON(byte b, String str) {
        super(b, str);
    }

    public FrameBodyTCON(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyTCON(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
