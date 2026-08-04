package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٔٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14891l implements InterfaceC1534l, InterfaceC18230l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final String f29278l = C14513l.applovin("SystemFgDispatcher");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f29279l = new Object();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final HashMap f29280l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C14637l f29281l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3307l f29282l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13432l f29283l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LinkedHashMap f29284l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0350l f29285l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public SystemForegroundService f29286l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final HashMap f29287l;

    public C14891l(Context context) {
        C13432l c13432lCrashlytics = C13432l.crashlytics(context);
        this.f29283l = c13432lCrashlytics;
        this.f29282l = c13432lCrashlytics.amazon;
        this.f29285l = null;
        this.f29284l = new LinkedHashMap();
        this.f29280l = new HashMap();
        this.f29287l = new HashMap();
        this.f29281l = new C14637l(c13432lCrashlytics.isPro);
        c13432lCrashlytics.billing.yandex(this);
    }

    public static Intent crashlytics(Context context, C0350l c0350l, C6842l c6842l) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c0350l.yandex);
        intent.putExtra("KEY_GENERATION", c0350l.loadAd);
        intent.putExtra("KEY_NOTIFICATION_ID", c6842l.yandex);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6842l.loadAd);
        intent.putExtra("KEY_NOTIFICATION", c6842l.crashlytics);
        return intent;
    }

    public final void amazon(Intent intent) {
        if (this.f29286l == null) {
            C8339l.smaato("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C0350l c0350l = new C0350l(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C14513l.tapsense().vip(f29278l, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            C8339l.metrica("Notification passed in the intent was null.");
            return;
        }
        C6842l c6842l = new C6842l(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f29284l;
        linkedHashMap.put(c0350l, c6842l);
        C6842l c6842l2 = (C6842l) linkedHashMap.get(this.f29285l);
        if (c6842l2 == null) {
            this.f29285l = c0350l;
        } else {
            this.f29286l.f486l.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((C6842l) ((Map.Entry) it.next()).getValue()).loadAd;
                }
                c6842l = new C6842l(c6842l2.yandex, c6842l2.crashlytics, i);
            } else {
                c6842l = c6842l2;
            }
        }
        SystemForegroundService systemForegroundService = this.f29286l;
        int i2 = c6842l.yandex;
        int i3 = c6842l.loadAd;
        Notification notification2 = c6842l.crashlytics;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            AbstractC11880l.m3274else(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            AbstractC11880l.m3271catch(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void billing(int i, int i2) {
        C14513l.tapsense().isVip(f29278l, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.f29284l.entrySet()) {
            if (((C6842l) entry.getValue()).loadAd == i2) {
                C0350l c0350l = (C0350l) entry.getKey();
                C13432l c13432l = this.f29283l;
                c13432l.amazon.yandex.execute(new RunnableC7571l(c13432l.billing, new C10771l(c0350l), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f29286l;
        if (systemForegroundService != null) {
            systemForegroundService.f485l = true;
            C14513l.tapsense().vip(SystemForegroundService.f483l, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }

    @Override // defpackage.InterfaceC18230l
    public final void loadAd(C0350l c0350l, boolean z) {
        Map.Entry entry;
        synchronized (this.f29279l) {
            try {
                InterfaceC7042l interfaceC7042l = ((C7718l) this.f29287l.remove(c0350l)) != null ? (InterfaceC7042l) this.f29280l.remove(c0350l) : null;
                if (interfaceC7042l != null) {
                    interfaceC7042l.ads(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6842l c6842l = (C6842l) this.f29284l.remove(c0350l);
        if (c0350l.equals(this.f29285l)) {
            if (this.f29284l.size() > 0) {
                Iterator it = this.f29284l.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f29285l = (C0350l) entry.getKey();
                if (this.f29286l != null) {
                    C6842l c6842l2 = (C6842l) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f29286l;
                    int i = c6842l2.yandex;
                    int i2 = c6842l2.loadAd;
                    Notification notification = c6842l2.crashlytics;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        AbstractC11880l.m3274else(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        AbstractC11880l.m3271catch(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.f29286l.f486l.cancel(c6842l2.yandex);
                }
            } else {
                this.f29285l = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f29286l;
        if (c6842l == null || systemForegroundService2 == null) {
            return;
        }
        C14513l.tapsense().vip(f29278l, "Removing Notification (id: " + c6842l.yandex + ", workSpecId: " + c0350l + ", notificationType: " + c6842l.loadAd);
        systemForegroundService2.f486l.cancel(c6842l.yandex);
    }

    public final void purchase() {
        this.f29286l = null;
        synchronized (this.f29279l) {
            try {
                Iterator it = this.f29280l.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC7042l) it.next()).ads(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f29283l.billing.mopub(this);
    }

    @Override // defpackage.InterfaceC1534l
    public final void yandex(C7718l c7718l, AbstractC13306l abstractC13306l) {
        if (abstractC13306l instanceof C7685l) {
            String str = c7718l.yandex;
            C14513l.tapsense().vip(f29278l, "Constraints unmet for WorkSpec " + str);
            C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l);
            int i = ((C7685l) abstractC13306l).yandex;
            C13432l c13432l = this.f29283l;
            c13432l.amazon.yandex.execute(new RunnableC7571l(c13432l.billing, new C10771l(c0350lIsPro), true, i));
        }
    }
}
