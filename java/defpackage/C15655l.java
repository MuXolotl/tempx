package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.List;

/* JADX INFO: renamed from: lْٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15655l implements InterfaceC7592l, InterfaceC10466l, InterfaceC5688l, InterfaceC8170l, InterfaceC10153l, InterfaceC14458l, InterfaceC12684l, InterfaceC9765l, InterfaceC15244l, InterfaceC7359l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30610l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30605l = new C15655l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30602l = new C15655l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30607l = new C15655l(19);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30606l = new C15655l(20);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30609l = new C15655l(21);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30603l = new C15655l(22);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30604l = new C15655l(23);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C15655l f30608l = new C15655l(25);

    public /* synthetic */ C15655l(int i) {
        this.f30610l = i;
    }

    public static C7346l loadAd(String str, C12105l c12105l) {
        C8195l c8195lLoadAd = AbstractC13041l.loadAd(c12105l);
        Charset charset = (Charset) c8195lLoadAd.f17098l;
        C12105l c12105l2 = (C12105l) c8195lLoadAd.f17097l;
        byte[] bytes = str.getBytes(charset);
        return yandex(bytes.length, c12105l2, bytes);
    }

    public static C7346l yandex(int i, C12105l c12105l, byte[] bArr) {
        AbstractC7712l.yandex(bArr.length, 0L, i);
        return new C7346l(i, c12105l, bArr);
    }

    @Override // defpackage.InterfaceC7592l
    public InterfaceC9354l admob(InterfaceC9354l interfaceC9354l, InterfaceC12932l interfaceC12932l) {
        throw null;
    }

    @Override // defpackage.InterfaceC8170l
    public void ads() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.InterfaceC14458l
    public InterfaceC6942l amazon(C6930l c6930l) {
        return new C14970l(12, c6930l);
    }

    @Override // defpackage.InterfaceC12684l
    public int billing(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i2 &= ((bArr[length] & 255) - 1) >> 31;
            i -= i2;
        }
    }

    @Override // defpackage.InterfaceC12684l
    public int crashlytics(int i, byte[] bArr) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return C3982l.yandex;
    }

    @Override // defpackage.InterfaceC5688l
    public Object mopub(SharedPreferences sharedPreferences, String str, Object obj) {
        return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        c11644l.mo619l(ExecutorServiceC18081l.class);
        return new C6319l();
    }

    @Override // defpackage.InterfaceC5688l
    public void subs(SharedPreferences sharedPreferences, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, bool.booleanValue());
        editorEdit.apply();
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        c18389l.close();
    }

    @Override // defpackage.InterfaceC8170l
    public void tapsense(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public String toString() {
        switch (this.f30610l) {
            case 10:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f30610l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(10000L, 68, "measurement.upload.max_conversions_per_day").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(5L, 46, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                C0022l c0022l = C6643l.license;
                C0022l c0022l2 = C15504l.isPro;
                AbstractC1051l.purchase("Must be called from the main thread.");
                C15504l c15504l = C15504l.smaato;
                AbstractC1051l.subs(c15504l);
                AbstractC1051l.purchase("Must be called from the main thread.");
                return c15504l.amazon.f24036l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                return (Long) C1801l.yandex.billing(-1L, 1, "measurement.test.cached_long_flag").get();
            case 20:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
            case 21:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(3600000L, 11, "45769094").get();
            case 22:
                List list6 = AbstractC5981l.yandex;
                return (Boolean) C11109l.yandex.get();
            case 23:
                return new Boolean(((Boolean) C10331l.yandex.get()).booleanValue());
        }
    }

    @Override // defpackage.InterfaceC12684l
    public void smaato(SecureRandom secureRandom) {
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
    }
}
