package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.FileNotFoundException;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lٌٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8876l implements InterfaceC8086l, InterfaceC15244l, InterfaceC0737l, InterfaceC16975l, InterfaceC1953l, InterfaceC10377l, InterfaceC12690l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18244l;

    public /* synthetic */ C8876l(C10287l c10287l) {
        this.f18244l = 9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void admob(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void amazon(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }

    public static /* synthetic */ void billing(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* bridge */ /* synthetic */ WatchService crashlytics(Object obj) {
        return (WatchService) obj;
    }

    public static /* bridge */ /* synthetic */ WatchKey loadAd(Object obj) {
        return (WatchKey) obj;
    }

    public static /* synthetic */ void subs(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        C5743l c5743l = (C5743l) obj;
        String strBilling = C3314l.loadAd.billing(c5743l);
        c5743l.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        return strBilling.getBytes(AbstractC9050l.yandex);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (this.f18244l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC13521l.signatures(new C17361l(2, new C6451l("Player release timed out.", 3, (byte) 0), 1003));
                break;
            default:
                interfaceC13521l.mo2738native();
                break;
        }
    }

    @Override // defpackage.InterfaceC0737l
    public C2432l mopub(C2432l c2432l) {
        C18659l c18659l = C18659l.yandex;
        Uri uri = c2432l.yandex;
        if (!AbstractC8576l.yandex(uri.getScheme(), "vkx") || uri.getPathSegments().size() != 2) {
            return c2432l;
        }
        return (C2432l) AbstractC10999l.subs(C17218l.f33421l, new C8912l(c2432l, null, 0));
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        switch (this.f18244l) {
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.yandex.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.crashlytics.get();
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.loadAd.get();
            case 14:
                C13252l c13252l = ExecutorsRegistrar.yandex;
                return EnumC8239l.f17128l;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c11644l);
        }
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        int i;
        switch (this.f18244l) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C8876l(int i) {
        this.f18244l = i;
    }

    @Override // defpackage.InterfaceC0737l
    public Uri purchase(Uri uri) {
        return uri;
    }
}
