package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: lؚؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3096l implements InterfaceC16148l {
    public final Class crashlytics;
    public final List loadAd;
    public final Method yandex;

    public AbstractC3096l(Method method, List list) {
        this.yandex = method;
        this.loadAd = list;
        this.crashlytics = method.getReturnType();
    }

    @Override // defpackage.InterfaceC16148l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC16148l
    public final /* bridge */ /* synthetic */ Member loadAd() {
        return null;
    }

    public final void purchase(Object[] objArr) {
        if (AbstractC17943l.loadAd(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(AbstractC17943l.loadAd(this));
        sb.append(" arguments, but ");
        C8339l.metrica(AbstractC14814l.remoteconfig(objArr.length, " were provided.", sb));
    }

    @Override // defpackage.InterfaceC16148l
    public final Type smaato() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC16148l
    public final List yandex() {
        return this.loadAd;
    }
}
