package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔۥ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3031l implements InterfaceC3770l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f6544l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f6545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6546l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f6547l;

    public AbstractC3031l(Object obj) {
        this.f6546l = 0;
        this.f6545l = obj;
        this.f6547l = new ArrayList();
        this.f6544l = obj;
    }

    @Override // defpackage.InterfaceC3770l
    public void adcel() {
        ArrayList arrayList = (ArrayList) this.f6547l;
        this.f6544l = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.InterfaceC3770l
    public void admob(Object obj) {
        ((ArrayList) this.f6547l).add(this.f6544l);
        this.f6544l = obj;
    }

    @Override // defpackage.InterfaceC3770l
    public void ads(Object obj, Function2 function2) {
        function2.invoke(this.f6544l, obj);
    }

    public abstract void crashlytics();

    @Override // defpackage.InterfaceC3770l
    public void isPro() {
        Object obj = this.f6544l;
        InterfaceC0492l interfaceC0492l = obj instanceof InterfaceC0492l ? (InterfaceC0492l) obj : null;
        if (interfaceC0492l != null) {
            interfaceC0492l.subs();
        }
    }

    public abstract C2312l loadAd();

    public String toString() {
        switch (this.f6546l) {
            case 2:
                return getClass().getSimpleName() + ": " + loadAd();
            default:
                return super.toString();
        }
    }

    public void yandex() {
        ((ArrayList) this.f6547l).clear();
        this.f6544l = this.f6545l;
        crashlytics();
    }

    public /* synthetic */ AbstractC3031l(Object obj, Object obj2, Object obj3, int i) {
        this.f6546l = i;
        this.f6545l = obj;
        this.f6544l = obj2;
        this.f6547l = obj3;
    }

    @Override // defpackage.InterfaceC3770l
    public /* synthetic */ void license() {
    }
}
