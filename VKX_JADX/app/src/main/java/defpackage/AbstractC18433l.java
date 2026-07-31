package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٛۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18433l extends AbstractC4620l implements InterfaceC1168l {
    public static volatile ExecutorC10149l premium;
    public final Set signatures;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC18433l(Context context, Looper looper, int i, C1424l c1424l, InterfaceC15669l interfaceC15669l, InterfaceC11821l interfaceC11821l) {
        C13304l c13304lYandex = C13304l.yandex(context);
        C7181l c7181l = C7181l.purchase;
        AbstractC1051l.subs(interfaceC15669l);
        AbstractC1051l.subs(interfaceC11821l);
        super(context, looper, c13304lYandex, c7181l, i, new C15848l(0, interfaceC15669l), new C5321l(interfaceC11821l), (String) c1424l.f3605l);
        Set set = (Set) c1424l.f3602l;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                C8339l.smaato("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.signatures = set;
        if (premium == null) {
            synchronized (AbstractC18433l.class) {
                try {
                    if (premium == null) {
                        context.getPackageName();
                        premium = ExecutorC10149l.yandex(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.AbstractC4620l
    public final Account admob() {
        return null;
    }

    @Override // defpackage.AbstractC4620l
    public final Executor isPro() {
        return premium;
    }

    @Override // defpackage.AbstractC4620l
    public final Set vip() {
        return this.signatures;
    }
}
