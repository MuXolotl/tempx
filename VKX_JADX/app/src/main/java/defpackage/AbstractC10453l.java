package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍَٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10453l implements InterfaceC2167l, InterfaceC11000l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f21268l = new HashMap();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f21269l;

    public AbstractC10453l(String str) {
        this.f21269l = str;
    }

    @Override // defpackage.InterfaceC11000l
    public final InterfaceC2167l admob(String str) {
        HashMap map = this.f21268l;
        return map.containsKey(str) ? (InterfaceC2167l) map.get(str) : InterfaceC2167l.f4805l;
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return new C4906l(this.f21268l.keySet().iterator());
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10453l)) {
            return false;
        }
        AbstractC10453l abstractC10453l = (AbstractC10453l) obj;
        String str = this.f21269l;
        if (str != null) {
            return str.equals(abstractC10453l.f21269l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC11000l
    public final void firebase(String str, InterfaceC2167l interfaceC2167l) {
        HashMap map = this.f21268l;
        if (interfaceC2167l == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2167l);
        }
    }

    public final int hashCode() {
        String str = this.f21269l;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        return this.f21269l;
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        return "toString".equals(str) ? new C13997l(this.f21269l) : AbstractC9029l.inmobi(this, new C13997l(str), c7502l, arrayList);
    }

    @Override // defpackage.InterfaceC11000l
    public final boolean vip(String str) {
        return this.f21268l.containsKey(str);
    }

    public abstract InterfaceC2167l yandex(C7502l c7502l, List list);

    @Override // defpackage.InterfaceC2167l
    public InterfaceC2167l metrica() {
        return this;
    }
}
