package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import androidx.car.app.navigation.model.Maneuver;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.Concert;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* JADX INFO: renamed from: lْۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13802l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f26934l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26935l;

    public /* synthetic */ C13802l(C4975l c4975l, C5073l c5073l) {
        this.f26935l = 16;
        this.f26934l = c5073l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        C6935l c6935lYandex;
        int i = this.f26935l;
        float fYandex = 0.0f;
        Object obj = this.f26934l;
        switch (i) {
            case 0:
                return (C2748l) ((C3607l) obj).yandex.get();
            case 1:
                return (C3607l) ((C18002l) obj).yandex.get();
            case 2:
                ((C5039l) obj).m4125private(new C6433l());
                return Unit.INSTANCE;
            case 3:
                C6433l c6433l = (C6433l) obj;
                if (c6433l.m2003instanceof() == EnumC9503l.f19384l) {
                    C7181l c7181l = C7181l.purchase;
                    int iCrashlytics = c7181l.crashlytics(c6433l.f34617l.getApplicationContext(), C13268l.yandex);
                    int i2 = AbstractC4197l.purchase;
                    if (iCrashlytics == 1 || iCrashlytics == 2 || iCrashlytics == 3 || iCrashlytics == 9) {
                        c7181l.purchase(c6433l.isVip(), iCrashlytics, 100, null);
                    }
                } else if (c6433l.m2003instanceof() == EnumC9503l.f19387l) {
                    if (c6433l.f13458l) {
                        Activity activityIsVip = c6433l.isVip();
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", c6433l.isVip().getPackageName(), null));
                        activityIsVip.startActivity(intent);
                    } else {
                        AbstractC7720l.billing(c6433l.isVip(), c6433l.f13460l, 1039);
                    }
                } else if (c6433l.m2003instanceof() == EnumC9503l.f19383l) {
                    Activity activityIsVip2 = c6433l.isVip();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts("package", "com.google.android.gms", null));
                    activityIsVip2.startActivity(intent2);
                }
                return Unit.INSTANCE;
            case 4:
                C14598l c14598l = (C14598l) obj;
                long j = c14598l.loadAd;
                return Float.valueOf((j - c14598l.yandex) / j);
            case 5:
                DecimalFormat decimalFormat = C15638l.yandex;
                C15638l.yandex(AbstractC11718l.mopub((Exception) obj));
                return Unit.INSTANCE;
            case 6:
                C12752l c12752l = (C12752l) obj;
                c12752l.f25126l.setValue(c12752l.m3501abstract());
                return Unit.INSTANCE;
            case 7:
                return new C16229l(AbstractC16901l.m4242synchronized(1, ((C16229l) obj).yandex));
            case 8:
                ((C18480l) obj).purchase(C8879l.yandex);
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) ((C12014l) obj).f23941l;
                int iIntValue = ((Integer) AbstractC15582l.yandex.get()).intValue();
                if (Build.VERSION.SDK_INT < 27) {
                    iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                }
                return Integer.valueOf(iIntValue);
            case 10:
                return ((Iterable) obj).iterator();
            case 11:
                Function0 function0 = ((C6206l) obj).f13106l;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 12:
                return Collections.singletonList((C8195l) obj);
            case 13:
                return Integer.valueOf(((C3981l) obj).loadAd.size());
            case 14:
                return Boolean.valueOf(((EnumC12805l) ((C10086l) ((C7463l) obj).yandex.crashlytics).getValue()) != EnumC12805l.f25184l);
            case 15:
                return AbstractC3803l.yandex(((C4975l) obj).isVip());
            case 16:
                C5073l c5073l = (C5073l) obj;
                InterfaceC12244l interfaceC12244l = c5073l.f11086l;
                C18364l c18364l = (C18364l) interfaceC12244l.getValue();
                List list = ((C18364l) interfaceC12244l.getValue()).f35876l;
                C18454l c18454l = C18454l.f36052l;
                c5073l.setValue(C18364l.loadAd(c18364l, false, false, 0, 0, AbstractC16901l.m4218final(new C7117l(85.0f, 1.0f, -45.0f, fYandex), list), 47));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Catalog2ButtonAction catalog2ButtonAction = ((Concert) obj).loadAd.yandex;
                if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
                    C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C10023l) obj).firebase(":memory:");
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C17812l) obj).amazon();
            case 20:
                return new C15271l((EnumC7283l) obj, 0.0f);
            case 21:
                return ((C5719l) obj).yandex();
            case 22:
                int i3 = DedicatedCacheMigrationService.f36651l;
                return new C12686l((DedicatedCacheMigrationService) obj);
            case 23:
                return ((C9656l) obj).crashlytics.appmetrica(34);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((InterfaceC5912l) obj).close();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC3102l interfaceC3102l = ((C15351l) obj).ads;
                if (interfaceC3102l != null && (c6935lYandex = interfaceC3102l.yandex()) != null) {
                    fYandex = c6935lYandex.yandex();
                }
                return Float.valueOf(fYandex);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return (InterfaceC6272l) obj;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10086l c10086l = ((C1026l) obj).f2856l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C6618l(2, (C13466l) obj);
            default:
                C13046l c13046l = (C13046l) obj;
                C4481l c4481l = c13046l.amazon;
                long j2 = c4481l.yandex;
                long j3 = c4481l.loadAd;
                try {
                    C18163l c18163l = c13046l.smaato;
                    c18163l.getClass();
                    AbstractC10999l.subs(C17218l.f33421l, new C10635l(c18163l, j2, j3, null));
                } catch (Exception e) {
                    ((InterfaceC6272l) c13046l.crashlytics.f20462l).smaato(e);
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c13046l.purchase;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c13046l.billing();
                    Unit unit = Unit.INSTANCE;
                    for (int i5 = 0; i5 < readHoldCount; i5++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                    if (!c13046l.subs.isEmpty()) {
                        c13046l.crashlytics();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    for (int i6 = 0; i6 < readHoldCount; i6++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                    throw th;
                }
        }
    }

    public /* synthetic */ C13802l(int i, Object obj) {
        this.f26935l = i;
        this.f26934l = obj;
    }
}
