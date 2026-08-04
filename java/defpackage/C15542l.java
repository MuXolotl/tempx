package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚٕٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15542l implements InterfaceC12165l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14529l f30372l = new C14529l(11);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10537l f30373l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public LocaleList f30374l;

    @Override // defpackage.InterfaceC12165l
    /* JADX INFO: renamed from: default */
    public final C10537l mo3369default() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f30372l) {
            C10537l c10537l = this.f30373l;
            if (c10537l != null && localeList == this.f30374l) {
                return c10537l;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new C9293l(localeList.get(i)));
            }
            C10537l c10537l2 = new C10537l(arrayList);
            this.f30374l = localeList;
            this.f30373l = c10537l2;
            return c10537l2;
        }
    }
}
