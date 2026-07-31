package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lؓؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1574l extends AbstractC11133l {
    public final C9304l crashlytics;
    public final InterfaceC1388l loadAd;

    public C1574l(InterfaceC1388l interfaceC1388l, InterfaceC16588l interfaceC16588l) {
        super(interfaceC16588l);
        this.loadAd = interfaceC1388l;
        this.crashlytics = new C9304l(interfaceC16588l.purchase(), 0);
    }

    @Override // defpackage.AbstractC17645l
    public final Iterator admob(Object obj) {
        return new C11521l(1, (Object[]) obj);
    }

    @Override // defpackage.AbstractC17645l
    public final Object billing() {
        return new ArrayList();
    }

    @Override // defpackage.AbstractC17645l
    public final int mopub(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC17645l
    public final Object remoteconfig(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((InterfaceC13937l) this.loadAd).mo1730private(), arrayList.size()));
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.AbstractC11133l
    public final void vip(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
