package defpackage;

import android.view.ActionMode;
import android.view.Window;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9582l implements InterfaceC13914l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C9582l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC13914l
    public final void yandex() {
        C7504l c7504l;
        boolean z = true;
        switch (this.yandex) {
            case 0:
                ((Window) this.loadAd).clearFlags(128);
                return;
            case 1:
                C12840l c12840l = ((C2429l) this.loadAd).yandex;
                if (c12840l != null) {
                    c12840l.subs();
                    return;
                } else {
                    C8339l.smaato("Launcher has not been initialized");
                    return;
                }
            case 2:
                DialogC7656l dialogC7656l = (DialogC7656l) this.loadAd;
                dialogC7656l.dismiss();
                dialogC7656l.f15784l.purchase();
                return;
            case 3:
                C11941l c11941l = (C11941l) this.loadAd;
                c11941l.purchase();
                c11941l.setTag(R.id.view_tree_lifecycle_owner, null);
                c11941l.setTag(R.id.view_tree_navigation_event_dispatcher_owner, null);
                c11941l.f23790l.removeViewImmediate(c11941l);
                C1527l navigationEventDispatcher = c11941l.getNavigationEventDispatcher();
                navigationEventDispatcher.amazon();
                navigationEventDispatcher.loadAd = true;
                C11315l c11315l = new C11315l();
                c11315l.addLast(navigationEventDispatcher);
                while (!c11315l.isEmpty()) {
                    C1527l c1527l = (C1527l) c11315l.removeFirst();
                    c1527l.loadAd = z;
                    C1807l c1807l = c1527l.billing;
                    C1807l c1807l2 = c1527l.mopub;
                    C1807l c1807l3 = c1527l.purchase;
                    Object[] objArr = c1807l3.loadAd;
                    long[] jArr = c1807l3.crashlytics;
                    int i = c1807l3.purchase;
                    while (i != Integer.MAX_VALUE) {
                        int i2 = (int) (2147483647L & (jArr[i] >> 31));
                        c11315l.addLast((C1527l) objArr[i]);
                        i = i2;
                    }
                    C1807l c1807lLoadAd = AbstractC4311l.loadAd(c1807l2);
                    Object[] objArr2 = c1807lLoadAd.loadAd;
                    long[] jArr2 = c1807lLoadAd.crashlytics;
                    int i3 = c1807lLoadAd.purchase;
                    while (i3 != Integer.MAX_VALUE) {
                        int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                        AbstractC14771l abstractC14771l = (AbstractC14771l) objArr2[i3];
                        C8048l c8048l = navigationEventDispatcher.amazon;
                        c8048l.firebase.admob(abstractC14771l);
                        c8048l.isPro.admob(abstractC14771l);
                        c8048l.subs.admob(abstractC14771l);
                        abstractC14771l.yandex = null;
                        abstractC14771l.crashlytics();
                        i3 = i4;
                    }
                    c1807l2.loadAd();
                    C1807l c1807lLoadAd2 = AbstractC4311l.loadAd(c1807l);
                    Object[] objArr3 = c1807lLoadAd2.loadAd;
                    long[] jArr3 = c1807lLoadAd2.crashlytics;
                    int i5 = c1807lLoadAd2.purchase;
                    while (i5 != Integer.MAX_VALUE) {
                        int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                        ((AbstractC5288l) objArr3[i5]).billing();
                        i5 = i6;
                    }
                    c1807l.loadAd();
                    c1807l3.loadAd();
                    z = true;
                }
                return;
            case 4:
                C18439l c18439l = (C18439l) this.loadAd;
                C0298l c0298l = c18439l.purchase;
                C4568l c4568l = c0298l.admob;
                if (c4568l != null) {
                    c4568l.crashlytics();
                }
                c0298l.yandex();
                ActionMode actionMode = c18439l.admob;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c18439l.admob = null;
                return;
            case 5:
                C0660l c0660l = (C0660l) this.loadAd;
                Executor executor = c0660l.yandex;
                if (executor == null) {
                    c0660l.crashlytics = true;
                    Function0 function0 = c0660l.loadAd;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    c0660l.loadAd = null;
                    return;
                }
                try {
                    executor.execute(new RunnableC5360l(20, c0660l));
                    return;
                } catch (RejectedExecutionException unused) {
                    synchronized (c0660l) {
                        c0660l.crashlytics = true;
                        Function0 function1 = c0660l.loadAd;
                        c0660l.loadAd = null;
                        Unit unit = Unit.INSTANCE;
                        if (function1 != null) {
                            function1.invoke();
                            return;
                        }
                        return;
                    }
                }
            case 6:
                C8300l c8300l = (C8300l) ((C2769l) this.loadAd).crashlytics.getValue();
                if (c8300l != null) {
                    c8300l.close();
                    return;
                }
                return;
            case 7:
                C12217l c12217l = (C12217l) this.loadAd;
                C4451l c4451l = c12217l.purchase.yandex;
                if (c4451l != null && (c7504l = c4451l.f9058l) != null) {
                    c7504l.ads(null);
                    c4451l.f9058l = null;
                }
                c12217l.firebase = null;
                return;
            case 8:
                C2397l c2397l = ((C15178l) this.loadAd).amazon;
                if (c2397l != null) {
                    c2397l.yandex(null);
                    return;
                }
                return;
            case 9:
                ((C0907l) this.loadAd).f2573l.invoke();
                return;
            case 10:
                ((C16173l) this.loadAd).metrica();
                return;
            case 11:
                ((C4947l) this.loadAd).amazon = null;
                return;
            case 12:
                C14541l c14541l = (C14541l) this.loadAd;
                C11919l c11919l = c14541l.crashlytics;
                if (c11919l != null) {
                    c11919l.f23764l = false;
                }
                c14541l.crashlytics = null;
                return;
            case 13:
                C15920l c15920l = (C15920l) this.loadAd;
                c15920l.billing = true;
                c15920l.amazon = 0;
                c15920l.loadAd.f31608l.remove(c15920l);
                C15920l c15920l2 = c15920l.purchase;
                if (c15920l2 != null) {
                    c15920l2.loadAd();
                }
                c15920l.purchase = null;
                return;
            case 14:
                DialogC0608l dialogC0608l = (DialogC0608l) this.loadAd;
                dialogC0608l.dismiss();
                dialogC0608l.f2061l.purchase();
                return;
            case 15:
                ((C2832l) this.loadAd).purchase = null;
                return;
            case 16:
                C0205l c0205l = (C0205l) this.loadAd;
                c0205l.smaato();
                c0205l.f1171l.setValue(Boolean.FALSE);
                return;
            default:
                ((C15263l) this.loadAd).amazon();
                return;
        }
    }
}
