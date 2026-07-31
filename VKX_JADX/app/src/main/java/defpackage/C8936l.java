package defpackage;

import android.graphics.PointF;
import android.util.Base64;
import android.util.JsonReader;
import android.view.contentcapture.ContentCaptureSession;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: lٌٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8936l implements InterfaceC9052l, InterfaceC17087l, InterfaceC5796l, InterfaceC16004l, InterfaceC15792l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18405l;

    public /* synthetic */ C8936l(int i) {
        this.f18405l = i;
    }

    public static /* synthetic */ void admob(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void firebase(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void isPro(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static void mopub(int i) {
        throw new C5016l(AbstractC0653l.vip(i, "An unknown field for index "));
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession purchase(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void remoteconfig(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void smaato(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void subs(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void vip(String str, Object obj, Object obj2, Object obj3) {
        throw new C3150l(str + obj + obj2 + obj3 + ')');
    }

    @Override // defpackage.InterfaceC9052l
    public double amazon(double d) {
        switch (this.f18405l) {
            case 6:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 7:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 8:
                float[] fArr = C3955l.yandex;
                return C3955l.loadAd(C3955l.crashlytics, d);
            case 9:
                float[] fArr2 = C3955l.yandex;
                return C3955l.yandex(C3955l.crashlytics, d);
            case 10:
                float[] fArr3 = C3955l.yandex;
                return C3955l.amazon(C3955l.amazon, d);
            default:
                float[] fArr4 = C3955l.yandex;
                return C3955l.crashlytics(C3955l.amazon, d);
        }
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC15792l
    public Object crashlytics(JsonReader jsonReader) throws IOException {
        int i = 0;
        switch (this.f18405l) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                C6541l.subs("Null libraryName");
                                return null;
                            }
                            break;
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                C6541l.subs("Null arch");
                                return null;
                            }
                            break;
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                C6541l.subs("Null buildId");
                                return null;
                            }
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && strNextString2 != null && strNextString3 != null) {
                    return new C13365l(strNextString, strNextString2, strNextString3);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" arch");
                }
                if (strNextString2 == null) {
                    sb.append(" libraryName");
                }
                if (strNextString3 == null) {
                    sb.append(" buildId");
                }
                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                jsonReader.beginObject();
                String strNextString4 = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString4 = jsonReader.nextString();
                        if (strNextString4 == null) {
                            C6541l.subs("Null filename");
                            return null;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            C6541l.subs("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString4 != null && bArrDecode != null) {
                    return new C10090l(strNextString4, bArrDecode);
                }
                StringBuilder sb2 = new StringBuilder();
                if (strNextString4 == null) {
                    sb2.append(" filename");
                }
                if (bArrDecode == null) {
                    sb2.append(" contents");
                }
                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb2));
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0960l c0960l = new C0960l();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                C6541l.subs("Null parameterKey");
                                return null;
                            }
                            c0960l.loadAd = strNextString5;
                            break;
                            break;
                        case "templateVersion":
                            c0960l.amazon = jsonReader.nextLong();
                            c0960l.purchase = (byte) (c0960l.purchase | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString6 = null;
                            String strNextString7 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    strNextString7 = jsonReader.nextString();
                                    if (strNextString7 == null) {
                                        C6541l.subs("Null variantId");
                                        return null;
                                    }
                                } else if (strNextName4.equals("rolloutId")) {
                                    strNextString6 = jsonReader.nextString();
                                    if (strNextString6 == null) {
                                        C6541l.subs("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString6 != null && strNextString7 != null) {
                                c0960l.yandex = new C9895l(strNextString6, strNextString7);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (strNextString6 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (strNextString7 == null) {
                                    sb3.append(" variantId");
                                }
                                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb3));
                                return null;
                            }
                            break;
                        case "parameterValue":
                            String strNextString8 = jsonReader.nextString();
                            if (strNextString8 == null) {
                                C6541l.subs("Null parameterValue");
                                return null;
                            }
                            c0960l.crashlytics = strNextString8;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return c0960l.yandex();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                jsonReader.beginObject();
                byte b = 0;
                int iNextInt = 0;
                String strNextString9 = null;
                List listAmazon = null;
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "frames":
                            listAmazon = C9228l.amazon(jsonReader, new C18725l(i));
                            if (listAmazon == null) {
                                C6541l.subs("Null frames");
                                return null;
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString9 = jsonReader.nextString();
                            if (strNextString9 == null) {
                                C6541l.subs("Null name");
                                return null;
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b = (byte) (b | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b == 1 && strNextString9 != null && listAmazon != null) {
                    return new C16498l(iNextInt, strNextString9, listAmazon);
                }
                StringBuilder sb4 = new StringBuilder();
                if (strNextString9 == null) {
                    sb4.append(" name");
                }
                if ((b & 1) == 0) {
                    sb4.append(" importance");
                }
                if (listAmazon == null) {
                    sb4.append(" frames");
                }
                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb4));
                return null;
            default:
                jsonReader.beginObject();
                byte b2 = 0;
                String strNextString10 = null;
                String str = null;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "name":
                            strNextString10 = jsonReader.nextString();
                            if (strNextString10 == null) {
                                C6541l.subs("Null name");
                                return null;
                            }
                            break;
                            break;
                        case "size":
                            b2 = (byte) (b2 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC2236l.yandex);
                            break;
                        case "baseAddress":
                            b2 = (byte) (b2 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 3 && strNextString10 != null) {
                    return new C0494l(jNextLong, jNextLong2, strNextString10, str);
                }
                StringBuilder sb5 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb5.append(" baseAddress");
                }
                if ((b2 & 2) == 0) {
                    sb5.append(" size");
                }
                if (strNextString10 == null) {
                    sb5.append(" name");
                }
                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb5));
                return null;
        }
    }

    @Override // defpackage.InterfaceC17087l
    public List loadAd(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.InterfaceC5796l
    public void yandex(C17270l c17270l) {
        PointF pointF = c17270l.yandex;
        float f = pointF.x;
        pointF.x = pointF.y;
        pointF.y = f;
    }
}
