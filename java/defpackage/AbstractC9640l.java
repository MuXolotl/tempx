package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍؘٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9640l implements InterfaceC16148l {
    public final List amazon;
    public final Class crashlytics;
    public final Type loadAd;
    public final Member yandex;

    public AbstractC9640l(Member member, Type type, Class cls, Type[] typeArr) {
        List listM2415super;
        this.yandex = member;
        this.loadAd = type;
        this.crashlytics = cls;
        if (cls != null) {
            C4384l c4384l = new C4384l(2);
            c4384l.loadAd(cls);
            c4384l.crashlytics(typeArr);
            ArrayList arrayList = c4384l.yandex;
            listM2415super = AbstractC14055l.remoteconfig(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM2415super = AbstractC8669l.m2415super(typeArr);
        }
        this.amazon = listM2415super;
    }

    public final void billing(Object obj) {
        if (obj == null || !this.yandex.getDeclaringClass().isInstance(obj)) {
            C8339l.metrica("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.InterfaceC16148l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC16148l
    public final Member loadAd() {
        return this.yandex;
    }

    public void purchase(Object[] objArr) {
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
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC16148l
    public final List yandex() {
        return this.amazon;
    }
}
