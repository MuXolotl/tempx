package ealvatag.tag.id3.framebody;

import defpackage.C0869l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberFixedLength;
import ealvatag.tag.datatype.NumberVariableLength;
import ealvatag.tag.datatype.StringNullTerminated;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyPOPM extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final int COUNTER_MINIMUM_FIELD_SIZE = 0;
    public static final String MEDIA_MONKEY_NO_EMAIL = "no@email";
    private static final int RATING_FIELD_SIZE = 1;

    public FrameBodyPOPM() {
        setObjectValue(DataTypes.OBJ_EMAIL, "");
        setObjectValue(DataTypes.OBJ_RATING, 0L);
        setObjectValue(DataTypes.OBJ_COUNTER, 0L);
    }

    public long getCounter() {
        return ((Number) getObjectValue(DataTypes.OBJ_COUNTER)).longValue();
    }

    public String getEmailToUser() {
        return (String) getObjectValue(DataTypes.OBJ_EMAIL);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "POPM";
    }

    public long getRating() {
        return ((Number) getObjectValue(DataTypes.OBJ_RATING)).longValue();
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return getEmailToUser() + ":" + getRating() + ":" + getCounter();
    }

    public void parseString(String str) {
        try {
            setRating(Integer.parseInt(str));
            setEmailToUser(MEDIA_MONKEY_NO_EMAIL);
        } catch (NumberFormatException unused) {
        }
    }

    public void setCounter(long j) {
        setObjectValue(DataTypes.OBJ_COUNTER, Long.valueOf(j));
    }

    public void setEmailToUser(String str) {
        setObjectValue(DataTypes.OBJ_EMAIL, str);
    }

    public void setRating(long j) {
        setObjectValue(DataTypes.OBJ_RATING, Long.valueOf(j));
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringNullTerminated(DataTypes.OBJ_EMAIL, this));
        addDataType(new NumberFixedLength(DataTypes.OBJ_RATING, this, 1));
        addDataType(new NumberVariableLength(DataTypes.OBJ_COUNTER, this, 0));
    }

    public FrameBodyPOPM(FrameBodyPOPM frameBodyPOPM) {
        super(frameBodyPOPM);
    }

    public FrameBodyPOPM(String str, long j, long j2) {
        setObjectValue(DataTypes.OBJ_EMAIL, str);
        setObjectValue(DataTypes.OBJ_RATING, Long.valueOf(j));
        setObjectValue(DataTypes.OBJ_COUNTER, Long.valueOf(j2));
    }

    public FrameBodyPOPM(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public FrameBodyPOPM(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
