package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12362l {
    public RunnableC5360l crashlytics;
    public final Handler yandex = new Handler(Looper.getMainLooper());
    public final ArrayList loadAd = new ArrayList();
    public final C10086l amazon = AbstractC8020l.smaato(null);
    public final C10086l purchase = AbstractC8020l.smaato(null);
    public final C15308l billing = new C15308l(0);
    public final C15308l mopub = new C15308l(0);
    public final C10086l admob = AbstractC8020l.smaato(Boolean.FALSE);

    public final void loadAd() {
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        c16076l.getClass();
        Long l = (Long) c16076l.admob(new C18606l(c16076l, 0));
        long jLongValue = l != null ? l.longValue() : 0L;
        C16076l c16076l2 = VKXApplication.f36632l;
        C16076l c16076l3 = c16076l2 != null ? c16076l2 : null;
        c16076l3.getClass();
        long jLongValue2 = ((Number) c16076l3.admob(new C18606l(c16076l3, 18))).longValue();
        ArrayList arrayList = this.loadAd;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                InterfaceC9265l interfaceC9265l = (InterfaceC9265l) it.next();
                long jLoadAd = interfaceC9265l.loadAd() == 0 ? jLongValue2 : interfaceC9265l.loadAd();
                if (interfaceC9265l.yandex() <= jLongValue && jLongValue <= jLoadAd) {
                    break;
                } else {
                    i++;
                }
            }
            C15308l c15308l = this.billing;
            c15308l.subs(i);
            int iAdmob = c15308l.admob();
            C15308l c15308l2 = this.mopub;
            if (iAdmob == -1 || !(arrayList.get(c15308l.admob()) instanceof C6331l)) {
                c15308l2.subs(0);
            } else {
                InterfaceC9265l interfaceC9265l2 = (InterfaceC9265l) arrayList.get(c15308l.admob());
                long jLoadAd2 = (interfaceC9265l2.loadAd() - interfaceC9265l2.yandex()) / 4;
                int i2 = jLongValue > interfaceC9265l2.yandex() + jLoadAd2 ? 1 : 0;
                if (jLongValue > (2 * jLoadAd2) + interfaceC9265l2.yandex()) {
                    i2++;
                }
                if (jLongValue > (jLoadAd2 * 3) + interfaceC9265l2.yandex()) {
                    i2++;
                }
                c15308l2.subs(i2);
            }
        }
        RunnableC5360l runnableC5360l = new RunnableC5360l(17, this);
        this.yandex.postDelayed(runnableC5360l, 50L);
        this.crashlytics = runnableC5360l;
    }

    public final InterfaceC0582l yandex() {
        return (InterfaceC0582l) this.purchase.getValue();
    }
}
