package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12379l;
import defpackage.AbstractC15690l;
import defpackage.AbstractC6745l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFrameBodyUrlLink extends AbstractID3v2FrameBody {
    private static final InterfaceC15756l LOG;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
    }

    public AbstractFrameBodyUrlLink(String str) {
        setObjectValue(DataTypes.OBJ_URLLINK, str);
    }

    private String encodeURL(String str) {
        try {
            String[] strArrSplit = str.split("(?<!/)/(?!/)", -1);
            StringBuilder sb = new StringBuilder(strArrSplit[0]);
            for (int i = 1; i < strArrSplit.length; i++) {
                sb.append("/");
                sb.append(URLEncoder.encode(strArrSplit[i], "utf-8"));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            InterfaceC15756l interfaceC15756l = LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i2 = C17500l.yandex;
            return str;
        }
    }

    public String getUrlLink() {
        return (String) getObjectValue(DataTypes.OBJ_URLLINK);
    }

    @Override // defpackage.AbstractC16446l
    public String getUserFriendlyValue() {
        return getUrlLink();
    }

    public void setUrlLink(String str) {
        AbstractC6745l.yandex(str);
        setObjectValue(DataTypes.OBJ_URLLINK, str);
    }

    @Override // defpackage.AbstractC16446l
    public void setupObjectList() {
        addDataType(new StringSizeTerminated(DataTypes.OBJ_URLLINK, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        CharsetEncoder charsetEncoderNewEncoder = AbstractC12379l.loadAd.newEncoder();
        String urlLink = getUrlLink();
        if (!charsetEncoderNewEncoder.canEncode(urlLink)) {
            setUrlLink(encodeURL(urlLink));
            if (charsetEncoderNewEncoder.canEncode(getUrlLink())) {
                InterfaceC15756l interfaceC15756l = LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                getUrlLink();
                ((C13975l) interfaceC15756l).getClass();
                int i = C17500l.yandex;
            } else {
                InterfaceC15756l interfaceC15756l2 = LOG;
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                ((C13975l) interfaceC15756l2).getClass();
                int i2 = C17500l.yandex;
                setUrlLink("");
            }
        }
        super.write(byteArrayOutputStream);
    }

    public AbstractFrameBodyUrlLink(AbstractFrameBodyUrlLink abstractFrameBodyUrlLink) {
        super(abstractFrameBodyUrlLink);
    }

    public AbstractFrameBodyUrlLink() {
    }

    public AbstractFrameBodyUrlLink(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public AbstractFrameBodyUrlLink(C0869l c0869l, int i) {
        super(c0869l, i);
    }
}
