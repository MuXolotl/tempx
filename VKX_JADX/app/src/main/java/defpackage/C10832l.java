package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10832l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21892l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10832l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f21892l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21892l;
        int i2 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                AbstractC15781l abstractC15781l = (AbstractC15781l) obj;
                C18662l c18662l = abstractC15781l.yandex;
                if (c18662l == null) {
                    c18662l = null;
                }
                AbstractC11990l.billing(c18662l, null);
                C15813l c15813l = abstractC15781l.purchase;
                if (c15813l == null) {
                    c15813l = null;
                }
                C12158l c12158l = c15813l.subs;
                if (c12158l != null && ((AtomicBoolean) c12158l.mopub).compareAndSet(false, true)) {
                    C15813l c15813l2 = (C15813l) c12158l.amazon;
                    C18396l c18396l = (C18396l) c12158l.isPro;
                    ReentrantLock reentrantLock = c15813l2.purchase;
                    reentrantLock.lock();
                    try {
                        C18340l c18340l = (C18340l) c15813l2.amazon.remove(c18396l);
                        reentrantLock.unlock();
                        if (c18340l != null) {
                            if (((C11919l) c15813l2.crashlytics.admob).vip(c18340l.loadAd)) {
                                C3156l c3156l = new C3156l(c15813l2, b2 == true ? 1 : 0, i2);
                                Thread.interrupted();
                                AbstractC10999l.subs(C17218l.f33421l, new C7864l(c3156l, b == true ? 1 : 0, 13));
                            }
                        }
                        try {
                            InterfaceC3669l interfaceC3669l = (InterfaceC3669l) c12158l.admob;
                            if (interfaceC3669l != null) {
                                interfaceC3669l.mo1409l((BinderC16987l) c12158l.firebase, c12158l.loadAd);
                            }
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                        }
                        ((Context) c12158l.purchase).unbindService((ServiceConnectionC14290l) c12158l.smaato);
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                    break;
                }
                C3512l c3512l = abstractC15781l.amazon;
                ((InterfaceC2636l) (c3512l != null ? c3512l : null).billing).close();
                return Unit.INSTANCE;
            case 1:
                ((InterfaceC4138l) obj).purchase();
                return Unit.INSTANCE;
            case 2:
                C0358l c0358l = (C0358l) obj;
                C7119l c7119l = c0358l.purchase;
                Unit unit = Unit.INSTANCE;
                if (c7119l.amazon(unit) instanceof C15230l) {
                    c0358l.loadAd.premium(-1);
                }
                return unit;
            case 3:
                ((C12457l) obj).mo1143default();
                return Unit.INSTANCE;
            case 4:
                ((C9169l) obj).mo1143default();
                return Unit.INSTANCE;
            case 5:
                ((C0130l) obj).purchase();
                return Unit.INSTANCE;
            case 6:
                C11279l c11279l = (C11279l) obj;
                c11279l.yandex(!((Boolean) c11279l.purchase.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 7:
                C11279l c11279l2 = (C11279l) obj;
                c11279l2.yandex(!((Boolean) c11279l2.purchase.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 8:
                C11279l c11279l3 = (C11279l) obj;
                c11279l3.yandex(!((Boolean) c11279l3.purchase.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 9:
                ((AbstractC14968l) obj).mo1143default();
                return Unit.INSTANCE;
            case 10:
                ((C17517l) obj).purchase();
                return Unit.INSTANCE;
            case 11:
                ((C17517l) obj).purchase();
                return Unit.INSTANCE;
            case 12:
                ((C2157l) obj).purchase();
                return Unit.INSTANCE;
            case 13:
                ((C6922l) obj).crashlytics.invoke();
                return Unit.INSTANCE;
            case 14:
                ((C9583l) obj).purchase();
                return Unit.INSTANCE;
            case 15:
                C6111l c6111l = (C6111l) obj;
                c6111l.getClass();
                new C17986l(C7635l.yandex, null).Signature(c6111l.isVip());
                return Unit.INSTANCE;
            case 16:
                C6111l c6111l2 = (C6111l) obj;
                c6111l2.getClass();
                new C13330l(R.string.cache_migration_header, R.string.cache_migration_text, R.string.cache_migration_start, null, null, new C10832l(0, c6111l2, C6111l.class, "dispatchAssetMigration", "dispatchAssetMigration()V", 0, 0, 17), null, 360).Signature(c6111l2.isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6111l c6111l3 = (C6111l) obj;
                c6111l3.getClass();
                int i3 = AbstractC7890l.yandex;
                AbstractC7890l.yandex(c6111l3.isVip(), AbstractC11990l.firebase(c6111l3), true, new C7306l((Object) c6111l3, (InterfaceC14029l) (b3 == true ? 1 : 0), 11));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C8748l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C8748l) obj).mo1143default();
                return Unit.INSTANCE;
            case 20:
                ((C8802l) obj).mo1143default();
                return Unit.INSTANCE;
            case 21:
                ((C14089l) obj).mo1143default();
                return Unit.INSTANCE;
            case 22:
                ((C13888l) obj).mo1143default();
                return Unit.INSTANCE;
            case 23:
                ((C7650l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C14107l) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C7679l) obj).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C8884l) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0675l c0675l = (C0675l) obj;
                c0675l.f2153l.setValue(Boolean.FALSE);
                AbstractC9033l.loadAd(c0675l, c0675l.isVip(), false, new C7052l(c0675l, (InterfaceC14029l) (b4 == true ? 1 : 0), 4));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C0675l) obj).mo1143default();
                return Unit.INSTANCE;
            default:
                ((C0675l) obj).m667public(true);
                return Unit.INSTANCE;
        }
    }
}
