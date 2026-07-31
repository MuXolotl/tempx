package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executors;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4269l implements InterfaceC7102l, InterfaceC17443l, InterfaceC17325l, InterfaceC12665l, InterfaceC14145l, InterfaceC18693l, InterfaceC14606l, InterfaceC11989l, InterfaceC10665l, InterfaceC9765l, InterfaceC6481l, InterfaceC12202l, InterfaceC8086l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C4269l f8759l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8764l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8756l = new C4269l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8761l = new C4269l(17);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8760l = new C4269l(18);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8763l = new C4269l(19);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8757l = new C4269l(20);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8758l = new C4269l(21);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C4269l f8762l = new C4269l(23);

    public /* synthetic */ C4269l(int i) {
        this.f8764l = i;
    }

    public static Typeface remoteconfig(String str, C6886l c6886l, int i) {
        if (i == 0 && AbstractC8576l.yandex(c6886l, C6886l.f14425l) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iLoadAd = AbstractC15852l.loadAd(i, c6886l);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iLoadAd) : Typeface.create(str, iLoadAd);
    }

    public static final C12643l startapp(Object obj, Object obj2) {
        C12643l c12643lYandex = (C12643l) obj;
        C12643l c12643l = (C12643l) obj2;
        if (!c12643l.isEmpty()) {
            if (!c12643lYandex.f24870l) {
                c12643lYandex = c12643lYandex.yandex();
            }
            c12643lYandex.crashlytics();
            if (!c12643l.isEmpty()) {
                c12643lYandex.putAll(c12643l);
            }
        }
        return c12643lYandex;
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        return (Iterable) C1459l.f3643l.get((InterfaceC1388l) obj);
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        switch (this.f8764l) {
            case 8:
                AbstractC5088l.yandex("Recorder", "Encodings end successfully.");
                throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
            default:
                AbstractC9831l.vip("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
                return;
        }
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC6481l
    public int billing(Context context, String str, boolean z) {
        return C7269l.amazon(context, str, z);
    }

    @Override // defpackage.InterfaceC12665l
    public String crashlytics() {
        return null;
    }

    @Override // defpackage.InterfaceC18693l
    public Typeface firebase(C3944l c3944l, C6886l c6886l, int i) {
        String strConcat = c3944l.f8124l;
        int i2 = c6886l.f14426l / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceRemoteconfig = remoteconfig(strConcat, c6886l, i);
            if (!AbstractC8576l.yandex(typefaceRemoteconfig, Typeface.create(Typeface.DEFAULT, AbstractC15852l.loadAd(i, c6886l))) && !AbstractC8576l.yandex(typefaceRemoteconfig, remoteconfig(null, c6886l, i))) {
                typeface = typefaceRemoteconfig;
            }
        }
        return typeface == null ? remoteconfig(c3944l.f8124l, c6886l, i) : typeface;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new ExecutorC17086l(Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.InterfaceC14145l
    public InterfaceC6272l isPro(String str) {
        return C2929l.f6382l;
    }

    @Override // defpackage.InterfaceC18693l
    public Typeface loadAd(int i, C6886l c6886l) {
        return remoteconfig(null, c6886l, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object metrica(Context context, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C2465l c2465l;
        if (abstractC0283l instanceof C2465l) {
            c2465l = (C2465l) abstractC0283l;
            int i = c2465l.f5250l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2465l.f5250l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2465l = new C2465l(this, abstractC0283l);
            }
        } else {
            c2465l = new C2465l(this, abstractC0283l);
        }
        Object objLoadAd = c2465l.f5249l;
        int i2 = c2465l.f5250l;
        boolean z = true;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C13432l c13432lCrashlytics = C13432l.crashlytics(context);
            C16565l c16565lPurchase = AbstractC11064l.purchase(new C17706l(c13432lCrashlytics.amazon.yandex, "loadStatusFuture", new C8652l(new C6908l(str, 18), c13432lCrashlytics.crashlytics, 24), 6));
            c2465l.f5250l = 1;
            objLoadAd = AbstractC3739l.loadAd(c16565lPurchase, c2465l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        List list = (List) objLoadAd;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (AbstractC14055l.remoteconfig(EnumC9176l.f18877l, EnumC9176l.f18878l).contains(((C4365l) list.get(i3)).loadAd)) {
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        AbstractC5641l.purchase("In-progress recording shouldn't be null", false);
        throw null;
    }

    @Override // defpackage.InterfaceC7102l
    public CharSequence purchase(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f425l.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.InterfaceC6481l
    public int subs(Context context, String str) {
        return C7269l.yandex(context, str);
    }

    public String toString() {
        switch (this.f8764l) {
            case 9:
                int iHashCode = hashCode();
                AbstractC8576l.loadAd(16);
                return AbstractC14814l.ads("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", AbstractC18202l.yandex.loadAd(InterfaceC3187l.class).license(), ">");
            default:
                return super.toString();
        }
    }

    public float vip(C9967l c9967l, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent == null || motionEvent2 == null) {
            return 1.0f;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        return 1.0f - (Math.max(0.0f, Math.min(c9967l.f20343l ? (int) (c9967l.getWidth() - (x - c9967l.getX())) : (int) (x - c9967l.getX()), c9967l.getWidth())) / c9967l.getWidth());
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f8764l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(86400000L, 29, "measurement.monitoring.sample_period_millis").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(10000L, 33, "measurement.upload.realtime_upload_interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(5000L, 36, "measurement.service_client.idle_disconnect_millis").get();
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(100L, 67, "measurement.upload.max_bundles").get()).longValue());
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(0L, 25, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            default:
                List list7 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.service.trigger_uris_high_priority", true, 2).get();
        }
    }

    public /* synthetic */ C4269l(int i, Object obj) {
        this.f8764l = i;
    }

    @Override // defpackage.InterfaceC12665l
    public void yandex() {
    }

    @Override // defpackage.InterfaceC12665l
    public void smaato(long j, String str) {
    }
}
