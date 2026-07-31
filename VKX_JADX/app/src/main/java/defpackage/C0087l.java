package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lّؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0087l extends AbstractC11133l {
    public final AbstractC6517l crashlytics;
    public final /* synthetic */ int loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087l(InterfaceC16588l interfaceC16588l, int i) {
        super(interfaceC16588l);
        this.loadAd = i;
        switch (i) {
            case 1:
                super(interfaceC16588l);
                this.crashlytics = new C9304l(interfaceC16588l.purchase(), 2);
                break;
            case 2:
                super(interfaceC16588l);
                this.crashlytics = new C9304l(interfaceC16588l.purchase(), 3);
                break;
            default:
                this.crashlytics = new C9304l(interfaceC16588l.purchase(), 1);
                break;
        }
    }

    @Override // defpackage.AbstractC17645l
    public final Iterator admob(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.AbstractC17645l
    public final Object billing() {
        switch (this.loadAd) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int mopub(Object obj) {
        switch (this.loadAd) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        switch (this.loadAd) {
            case 0:
                break;
            case 1:
                break;
        }
        return (C9304l) this.crashlytics;
    }

    @Override // defpackage.AbstractC17645l
    public final Object remoteconfig(Object obj) {
        switch (this.loadAd) {
            case 0:
                return (ArrayList) obj;
            case 1:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        switch (this.loadAd) {
            case 0:
                return new ArrayList((Collection) null);
            case 1:
                return new HashSet((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // defpackage.AbstractC11133l
    public final void vip(int i, Object obj, Object obj2) {
        switch (this.loadAd) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            case 1:
                ((HashSet) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
