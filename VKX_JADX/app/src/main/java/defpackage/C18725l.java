package defpackage;

import android.util.JsonReader;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: renamed from: lۧۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18725l implements InterfaceC15792l, InterfaceC8086l, InterfaceC16975l, InterfaceC5515l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36506l;

    public static /* synthetic */ void amazon(Object obj) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void billing() {
        throw new C6451l(11);
    }

    public static /* synthetic */ void loadAd() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void mopub(Object obj) throws SignatureException {
        throw new SignatureException(obj.toString());
    }

    public static /* synthetic */ void purchase(Object obj, String str) {
        throw new RuntimeException(str + ((Object) obj.toString()));
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        C5761l.loadAd.getClass();
        return C9228l.yandex.billing((AbstractC2236l) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // defpackage.InterfaceC15792l
    public Object crashlytics(JsonReader jsonReader) {
        return C9228l.yandex(jsonReader);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        switch (this.f36506l) {
            case 7:
                interfaceC5252l.getClass();
                break;
            case 8:
                interfaceC5252l.getClass();
                break;
            case 9:
                interfaceC5252l.getClass();
                break;
            case 10:
                interfaceC5252l.getClass();
                break;
            case 11:
                interfaceC5252l.getClass();
                break;
            case 12:
                interfaceC5252l.getClass();
                break;
            case 13:
                interfaceC5252l.getClass();
                break;
            case 14:
                interfaceC5252l.getClass();
                break;
            case 15:
                interfaceC5252l.getClass();
                break;
            case 16:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                interfaceC5252l.getClass();
                break;
            case 20:
                interfaceC5252l.getClass();
                break;
            case 21:
                interfaceC5252l.getClass();
                break;
            case 22:
                interfaceC5252l.getClass();
                break;
            case 23:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                interfaceC5252l.getClass();
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                interfaceC5252l.getClass();
                break;
            default:
                interfaceC5252l.getClass();
                break;
        }
    }

    @Override // defpackage.InterfaceC5515l
    public Constructor yandex() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC14833l.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public /* synthetic */ C18725l(int i) {
        this.f36506l = i;
    }

    public /* synthetic */ C18725l(C5597l c5597l, int i) {
        this.f36506l = i;
    }
}
