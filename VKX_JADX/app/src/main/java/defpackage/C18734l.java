package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18734l implements Appendable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f36516l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f36517l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final StringBuilder f36518l;

    public C18734l() {
        this.f36518l = new StringBuilder(16);
        this.f36517l = new ArrayList();
        this.f36516l = new ArrayList();
        new ArrayList();
    }

    public final void amazon(int i) {
        ArrayList arrayList = this.f36517l;
        if (i >= arrayList.size()) {
            AbstractC1786l.loadAd(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                AbstractC1786l.loadAd("Nothing to pop.");
            }
            ((C4253l) arrayList.remove(arrayList.size() - 1)).crashlytics = this.f36518l.length();
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C3625l) {
            yandex((C3625l) charSequence);
            return this;
        }
        this.f36518l.append(charSequence);
        return this;
    }

    public final C3625l billing() {
        StringBuilder sb = this.f36518l;
        String string = sb.toString();
        ArrayList arrayList = this.f36516l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C4253l) arrayList.get(i)).yandex(sb.length()));
        }
        return new C3625l(string, arrayList2);
    }

    public final void crashlytics(String str) {
        this.f36518l.append(str);
    }

    public final void loadAd(C3625l c3625l, int i, int i2) {
        StringBuilder sb = this.f36518l;
        int length = sb.length();
        sb.append((CharSequence) c3625l.f7563l, i, i2);
        List listYandex = AbstractC0255l.yandex(c3625l, i, i2, null);
        if (listYandex != null) {
            int size = listYandex.size();
            for (int i3 = 0; i3 < size; i3++) {
                C15012l c15012l = (C15012l) listYandex.get(i3);
                this.f36516l.add(new C4253l(c15012l.loadAd + length, c15012l.crashlytics + length, c15012l.yandex, c15012l.amazon));
            }
        }
    }

    public final int purchase(C14264l c14264l) {
        C4253l c4253l = new C4253l(c14264l, this.f36518l.length(), 0, 12);
        ArrayList arrayList = this.f36517l;
        arrayList.add(c4253l);
        this.f36516l.add(c4253l);
        return arrayList.size() - 1;
    }

    public final void yandex(C3625l c3625l) {
        StringBuilder sb = this.f36518l;
        int length = sb.length();
        sb.append(c3625l.f7563l);
        List list = c3625l.f7564l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C15012l c15012l = (C15012l) list.get(i);
                this.f36516l.add(new C4253l(c15012l.loadAd + length, c15012l.crashlytics + length, c15012l.yandex, c15012l.amazon));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof C3625l) {
            loadAd((C3625l) charSequence, i, i2);
            return this;
        }
        this.f36518l.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f36518l.append(c);
        return this;
    }

    public C18734l(C3625l c3625l) {
        this();
        yandex(c3625l);
    }
}
