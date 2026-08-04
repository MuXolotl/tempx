package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lَٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C10303l implements InterfaceC2167l, InterfaceC11000l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashMap f20990l = new HashMap();

    @Override // defpackage.InterfaceC11000l
    public final InterfaceC2167l admob(String str) {
        HashMap map = this.f20990l;
        return map.containsKey(str) ? (InterfaceC2167l) map.get(str) : InterfaceC2167l.f4805l;
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return new C4906l(this.f20990l.keySet().iterator());
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10303l) {
            return this.f20990l.equals(((C10303l) obj).f20990l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC11000l
    public final void firebase(String str, InterfaceC2167l interfaceC2167l) {
        HashMap map = this.f20990l;
        if (interfaceC2167l == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2167l);
        }
    }

    public final int hashCode() {
        return this.f20990l.hashCode();
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        C10303l c10303l = new C10303l();
        for (Map.Entry entry : this.f20990l.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC11000l;
            HashMap map = c10303l.f20990l;
            if (z) {
                map.put((String) entry.getKey(), (InterfaceC2167l) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC2167l) entry.getValue()).metrica());
            }
        }
        return c10303l;
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        return "[object Object]";
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2167l
    public InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        return "toString".equals(str) ? new C13997l(toString()) : AbstractC9029l.inmobi(this, new C13997l(str), c7502l, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f20990l;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11000l
    public final boolean vip(String str) {
        return this.f20990l.containsKey(str);
    }
}
