package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFrameBodyPairs extends AbstractID3v2FrameBody implements ID3v24FrameBody {
    public AbstractFrameBodyPairs(byte b, String str) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
        setText(str);
    }

    public void addPair(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        if (stringTokenizer.countTokens() == 2) {
            addPair(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        } else {
            addPair("", str);
        }
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public abstract String getIdentifier();

    public String getKeyAtIndex(int i) {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().get(i).getKey();
    }

    public int getNumberOfPairs() {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getNumberOfPairs();
    }

    public PairedTextEncodedStringNullTerminated.ValuePairs getPairing() {
        return (PairedTextEncodedStringNullTerminated.ValuePairs) getObject(DataTypes.OBJ_TEXT).getValue();
    }

    public String getText() {
        PairedTextEncodedStringNullTerminated pairedTextEncodedStringNullTerminated = (PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Pair pair : pairedTextEncodedStringNullTerminated.getValue().getMapping()) {
            sb.append(pair.getKey() + (char) 0 + pair.getValue());
            if (i != getNumberOfPairs()) {
                sb.append((char) 0);
            }
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return getText();
    }

    public String getValueAtIndex(int i) {
        return ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().get(i).getValue();
    }

    public void resetPairs() {
        ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().getMapping().clear();
    }

    public void setText(String str) {
        PairedTextEncodedStringNullTerminated.ValuePairs valuePairs = new PairedTextEncodedStringNullTerminated.ValuePairs();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\u0000");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                valuePairs.add(strNextToken, stringTokenizer.nextToken());
            }
        }
        setObjectValue(DataTypes.OBJ_TEXT, valuePairs);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TEXT_ENCODING, this, 1));
        addDataType(new PairedTextEncodedStringNullTerminated(DataTypes.OBJ_TEXT, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        if (!((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).canBeEncoded()) {
            setTextEncoding((byte) 1);
        }
        super.write(byteArrayOutputStream);
    }

    public AbstractFrameBodyPairs() {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
    }

    public AbstractFrameBodyPairs(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public AbstractFrameBodyPairs(C0869l c0869l, int i) {
        super(c0869l, i);
    }

    public void addPair(String str, String str2) {
        ((PairedTextEncodedStringNullTerminated) getObject(DataTypes.OBJ_TEXT)).getValue().add(str, str2);
    }
}
