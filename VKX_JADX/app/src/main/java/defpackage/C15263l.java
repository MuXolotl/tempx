package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۢۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15263l implements InterfaceC0119l, InterfaceC18679l, InterfaceC3266l, InterfaceC5755l, InterfaceC2785l, InterfaceC7456l, InterfaceC14382l, InterfaceC1953l, InterfaceC0407l, InterfaceC12350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f29857l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29858l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29859l;

    public /* synthetic */ C15263l(boolean z, C12417l c12417l, Bundle bundle) {
        this.f29859l = 3;
        this.f29858l = c12417l;
        this.f29857l = bundle;
    }

    private final void billing() {
        Map mapSingletonMap;
        C11919l c11919l = (C11919l) this.f29858l;
        Function1 function1 = (Function1) this.f29857l;
        synchronized (((C6096l) c11919l.f23763l)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) c11919l.f23766l);
            linkedHashMap.remove(function1);
            int size = linkedHashMap.size();
            if (size == 0) {
                mapSingletonMap = C14054l.f27396l;
            } else if (size != 1) {
                mapSingletonMap = linkedHashMap;
            } else {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
            c11919l.f23766l = mapSingletonMap;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        int i = this.f29859l;
        Object obj2 = this.f29857l;
        Object obj3 = this.f29858l;
        switch (i) {
            case 2:
                BinderC4841l binderC4841l = (BinderC4841l) obj3;
                C4970l c4970lLoadAd = (C4970l) obj2;
                C18602l c18602l = (C18602l) obj;
                AbstractC13675l abstractC13675l = c4970lLoadAd.f10156synchronized;
                if (!abstractC13675l.isEmpty()) {
                    C10806l c10806lCrashlytics = c4970lLoadAd.yandex().crashlytics();
                    AbstractC10199l abstractC10199lRemoteconfig = abstractC13675l.values().iterator();
                    while (abstractC10199lRemoteconfig.hasNext()) {
                        C0815l c0815l = (C0815l) abstractC10199lRemoteconfig.next();
                        C11916l c11916l = (C11916l) binderC4841l.admob.f3554l.get(c0815l.yandex.loadAd);
                        if (c11916l == null || c0815l.yandex.yandex != c11916l.yandex) {
                            c10806lCrashlytics.yandex(c0815l);
                        } else {
                            c10806lCrashlytics.yandex(new C0815l(c11916l, c0815l.loadAd));
                        }
                    }
                    c4970lLoadAd = c10806lCrashlytics.loadAd();
                }
                c18602l.mo2800private(c4970lLoadAd);
                break;
            case 3:
            case 5:
            default:
                C13698l c13698l = (C13698l) obj3;
                ((InterfaceC4784l) obj).loadAd(c13698l.f26744l, (C5019l) c13698l.f26743l, (C2040l) obj2);
                break;
            case 4:
                C6499l c6499l = (C6499l) obj2;
                C3726l c3726l = (C3726l) ((BinderC4841l) obj3).purchase.get();
                if (c3726l != null && !c3726l.metrica()) {
                    c3726l.smaato(c6499l, false);
                    break;
                }
                break;
            case 6:
                BinderC4841l binderC4841l2 = (BinderC4841l) obj3;
                Surface surface = (Surface) obj2;
                C18602l c18602l2 = (C18602l) obj;
                ((C3726l) binderC4841l2.purchase.get()).getClass();
                if (surface != null) {
                    SurfaceHolderC12693l surfaceHolderC12693l = new SurfaceHolderC12693l(surface);
                    binderC4841l2.firebase = surfaceHolderC12693l;
                    c18602l2.mo2750catch(surfaceHolderC12693l);
                } else {
                    c18602l2.mo2750catch(null);
                    binderC4841l2.firebase = null;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(final C3726l c3726l, final C6499l c6499l, int i) {
        int i2 = this.f29859l;
        Object obj = this.f29857l;
        Object obj2 = this.f29858l;
        switch (i2) {
            case 3:
                return c3726l.tapsense(c6499l, (C12417l) obj2, (Bundle) obj);
            case 4:
            case 6:
            default:
                InterfaceC3266l interfaceC3266l = (InterfaceC3266l) obj2;
                final InterfaceC13934l interfaceC13934l = (InterfaceC13934l) obj;
                if (c3726l.metrica()) {
                    return AbstractC7151l.purchase(new C5159l(-100));
                }
                final int i3 = 1;
                return AbstractC15323l.m3983this((ListenableFuture) interfaceC3266l.admob(c3726l, c6499l, i), new InterfaceC12538l() { // from class: lَٕ۠
                    @Override // defpackage.InterfaceC12538l
                    public final ListenableFuture apply(Object obj3) {
                        int i4 = i3;
                        int i5 = 9;
                        Object obj4 = interfaceC13934l;
                        switch (i4) {
                            case 0:
                                C3726l c3726l2 = c3726l;
                                Handler handler = c3726l2.smaato;
                                RunnableC12388l runnableC12388l = new RunnableC12388l(c3726l2, c6499l, new RunnableC10613l(c3726l2, (C6541l) obj4, (C9896l) obj3, 29));
                                C5159l c5159l = new C5159l(0);
                                String str = AbstractC15323l.yandex;
                                C1090l c1090l = new C1090l();
                                AbstractC15323l.m3966final(handler, new RunnableC15278l(c1090l, runnableC12388l, c5159l, i5));
                                return c1090l;
                            default:
                                List list = (List) obj3;
                                C3726l c3726l3 = c3726l;
                                Handler handler2 = c3726l3.smaato;
                                C6499l c6499l2 = c6499l;
                                RunnableC12388l runnableC12388l2 = new RunnableC12388l(c3726l3, c6499l2, new RunnableC4063l(c3726l3, (InterfaceC13934l) obj4, c6499l2, list, 15));
                                C5159l c5159l2 = new C5159l(0);
                                String str2 = AbstractC15323l.yandex;
                                C1090l c1090l2 = new C1090l();
                                AbstractC15323l.m3966final(handler2, new RunnableC15278l(c1090l2, runnableC12388l2, c5159l2, i5));
                                return c1090l2;
                        }
                    }
                });
            case 5:
                C15035l c15035l = c3726l.purchase;
                c3726l.m1421volatile(c6499l);
                C8149l c8149lPurchase = AbstractC16840l.purchase(3, null, c15035l.yandex, new C0932l(c15035l, (String) obj2, (AbstractC7778l) obj, (InterfaceC14029l) null, 12));
                AbstractC12442l.metrica(c8149lPurchase, "Callback.onSetRating must return non-null future");
                return c8149lPurchase;
            case 7:
                InterfaceC3266l interfaceC3266l2 = (InterfaceC3266l) obj2;
                final C6541l c6541l = (C6541l) obj;
                if (c3726l.metrica()) {
                    return AbstractC7151l.purchase(new C5159l(-100));
                }
                final int i4 = 0;
                return AbstractC15323l.m3983this((ListenableFuture) interfaceC3266l2.admob(c3726l, c6499l, i), new InterfaceC12538l() { // from class: lَٕ۠
                    @Override // defpackage.InterfaceC12538l
                    public final ListenableFuture apply(Object obj3) {
                        int i5 = i4;
                        int i6 = 9;
                        Object obj4 = c6541l;
                        switch (i5) {
                            case 0:
                                C3726l c3726l2 = c3726l;
                                Handler handler = c3726l2.smaato;
                                RunnableC12388l runnableC12388l = new RunnableC12388l(c3726l2, c6499l, new RunnableC10613l(c3726l2, (C6541l) obj4, (C9896l) obj3, 29));
                                C5159l c5159l = new C5159l(0);
                                String str = AbstractC15323l.yandex;
                                C1090l c1090l = new C1090l();
                                AbstractC15323l.m3966final(handler, new RunnableC15278l(c1090l, runnableC12388l, c5159l, i6));
                                return c1090l;
                            default:
                                List list = (List) obj3;
                                C3726l c3726l3 = c3726l;
                                Handler handler2 = c3726l3.smaato;
                                C6499l c6499l2 = c6499l;
                                RunnableC12388l runnableC12388l2 = new RunnableC12388l(c3726l3, c6499l2, new RunnableC4063l(c3726l3, (InterfaceC13934l) obj4, c6499l2, list, 15));
                                C5159l c5159l2 = new C5159l(0);
                                String str2 = AbstractC15323l.yandex;
                                C1090l c1090l2 = new C1090l();
                                AbstractC15323l.m3966final(handler2, new RunnableC15278l(c1090l2, runnableC12388l2, c5159l2, i6));
                                return c1090l2;
                        }
                    }
                });
        }
    }

    public void amazon() {
        switch (this.f29859l) {
            case 10:
                billing();
                return;
            default:
                C18480l c18480l = (C18480l) this.f29858l;
                Function1 function1 = (Function1) this.f29857l;
                synchronized (((C6096l) c18480l.f36084l)) {
                    c18480l.f36087l = AbstractC9905l.amazon((Set) c18480l.f36087l, function1);
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0407l
    public Object apply(Object obj) {
        C16163l c16163l = (C16163l) this.f29858l;
        C4330l c4330l = (C4330l) this.f29857l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C17964l c17964l = c16163l.f31662l;
        ArrayList arrayListVip = c16163l.vip(sQLiteDatabase, c4330l, c17964l.loadAd);
        for (EnumC14251l enumC14251l : EnumC14251l.values()) {
            if (enumC14251l != c4330l.crashlytics) {
                int size = c17964l.loadAd - arrayListVip.size();
                if (size <= 0) {
                    break;
                }
                arrayListVip.addAll(c16163l.vip(sQLiteDatabase, c4330l.loadAd(enumC14251l), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListVip.size(); i++) {
            sb.append(((C6468l) arrayListVip.get(i)).yandex);
            if (i < arrayListVip.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C8377l(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListVip.listIterator();
        while (listIterator.hasNext()) {
            C6468l c6468l = (C6468l) listIterator.next();
            long j2 = c6468l.yandex;
            if (map.containsKey(Long.valueOf(j2))) {
                C18289l c18289lCrashlytics = c6468l.crashlytics.crashlytics();
                for (C8377l c8377l : (Set) map.get(Long.valueOf(j2))) {
                    c18289lCrashlytics.loadAd(c8377l.yandex, c8377l.loadAd);
                }
                listIterator.set(new C6468l(j2, c6468l.loadAd, c18289lCrashlytics.crashlytics()));
            }
        }
        return arrayListVip;
    }

    @Override // defpackage.InterfaceC0119l
    public void crashlytics(C6499l c6499l) {
        int i = this.f29859l;
        Object obj = this.f29857l;
        C13350l c13350l = (C13350l) this.f29858l;
        switch (i) {
            case 0:
                ((C14869l) obj).admob(c13350l.admob.tapsense);
                break;
            default:
                String str = ((C0579l) obj).f1992l;
                if (TextUtils.isEmpty(str)) {
                    AbstractC6427l.vip("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    C18602l c18602l = c13350l.admob.tapsense;
                    if (c18602l.mo2779l(17)) {
                        AbstractC10759l abstractC10759lMo2791l = c18602l.mo2791l();
                        C4322l c4322l = new C4322l();
                        for (int i2 = 0; i2 < abstractC10759lMo2791l.metrica(); i2++) {
                            if (TextUtils.equals(abstractC10759lMo2791l.remoteconfig(i2, c4322l, 0L).crashlytics.yandex, str)) {
                                c18602l.mo2756extends(i2);
                            }
                        }
                    } else {
                        AbstractC6427l.vip("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        int i = this.f29859l;
        Object obj = this.f29857l;
        Object obj2 = this.f29858l;
        switch (i) {
            case 14:
                C3585l c3585l = (C3585l) obj2;
                C17879l c17879l = (C17879l) c3585l.f7511l;
                if (c17879l != null) {
                    C5807l c5807l2 = (C5807l) c17879l.yandex;
                    Objects.requireNonNull(c5807l2);
                    c5807l2.crashlytics();
                }
                c3585l.f7511l = new C17879l(c5807l, obj);
                return AbstractC15560l.subscription(obj, "PendingValue ");
            case 21:
                ((AtomicReference) obj).set(c5807l);
                return "SurfaceRequest-surface-recreation(" + ((C15691l) obj2).hashCode() + ")";
            case 23:
                C3608l c3608l = (C3608l) obj2;
                Surface surface = (Surface) obj;
                AbstractC5088l.yandex("TextureViewImpl", "Surface set on Preview.");
                c3608l.admob.yandex(surface, AbstractC12272l.yandex(), new C10927l(2, c5807l));
                return "provideSurface[request=" + c3608l.admob + " surface=" + surface + "]";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c5807l.yandex(new RunnableC16663l(atomicBoolean, 1), EnumC13705l.f26759l);
                ((Executor) obj2).execute(new RunnableC10364l(atomicBoolean, c5807l, (Function0) obj, 1));
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
        InterfaceC2785l interfaceC2785l = (InterfaceC2785l) this.f29858l;
        InterfaceC2785l interfaceC2785l2 = (InterfaceC2785l) this.f29857l;
        interfaceC2785l.loadAd(interfaceC15189l);
        interfaceC2785l2.loadAd(interfaceC15189l);
    }

    public Object mopub(C4003l c4003l) {
        Class cls;
        C3300l c3300l = (C3300l) this.f29858l;
        C12107l c12107l = (C12107l) this.f29857l;
        AbstractC6968l abstractC6968lYandex = c4003l.yandex();
        switch (c12107l.yandex) {
            case 0:
                cls = InterfaceC13883l.class;
                break;
            case 1:
                cls = C8375l.class;
                break;
            case 2:
                cls = InterfaceC10135l.class;
                break;
            case 3:
                cls = InterfaceC11416l.class;
                break;
            case 4:
                cls = InterfaceC10634l.class;
                break;
            default:
                cls = InterfaceC1218l.class;
                break;
        }
        return c3300l.loadAd(abstractC6968lYandex, cls);
    }

    @Override // defpackage.InterfaceC12350l
    public Object purchase() {
        int i = this.f29859l;
        Object obj = this.f29857l;
        C7644l c7644l = (C7644l) this.f29858l;
        switch (i) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                Iterable iterable = (Iterable) obj;
                C16163l c16163l = (C16163l) c7644l.f15734l;
                c16163l.getClass();
                if (iterable.iterator().hasNext()) {
                    c16163l.yandex().compileStatement("DELETE FROM events WHERE _id in ".concat(C16163l.isVip(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((C16163l) c7644l.f15741l).adcel(((Integer) entry.getValue()).intValue(), EnumC4628l.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        C18396l c18396l = (C18396l) this.f29858l;
        String str = (String) this.f29857l;
        synchronized (c18396l) {
            ((C11154l) c18396l.f35933l).remove(str);
        }
        return c3823l;
    }

    @Override // defpackage.InterfaceC5755l
    public void subs(InterfaceC12679l interfaceC12679l) {
        int i = this.f29859l;
        Object obj = this.f29857l;
        Object obj2 = this.f29858l;
        switch (i) {
            case 11:
                ((InterfaceC5755l) obj).subs((C10685l) obj2);
                break;
            default:
                ((InterfaceC5755l) obj).subs((C6344l) obj2);
                break;
        }
    }

    @Override // defpackage.InterfaceC14382l
    public boolean yandex() {
        C11045l c11045l = (C11045l) this.f29858l;
        C10609l c10609l = (C10609l) this.f29857l;
        if (!c11045l.adcel) {
            c11045l.admob();
            long jYandex = C10609l.yandex(c11045l.metrica, c10609l.yandex);
            c10609l.yandex = jYandex;
            c11045l.adcel = !c11045l.mopub(c11045l.vip, jYandex + c10609l.loadAd);
        }
        return c11045l.adcel;
    }

    public /* synthetic */ C15263l(Object obj, Object obj2, int i) {
        this.f29859l = i;
        this.f29858l = obj;
        this.f29857l = obj2;
    }
}
