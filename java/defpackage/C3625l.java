package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3625l implements CharSequence {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13645l f7561l = AbstractC2896l.yandex;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f7562l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f7563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f7564l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f7565l;

    public C3625l(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f7564l = list;
        this.f7563l = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C15012l c15012l = (C15012l) list.get(i);
                Object obj = c15012l.yandex;
                if (obj instanceof C14264l) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c15012l);
                } else if (obj instanceof C9077l) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c15012l);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f7562l = arrayList;
        this.f7565l = arrayList2;
        List listM4243this = arrayList2 != null ? AbstractC16901l.m4243this(arrayList2, new C13617l(8)) : null;
        if (listM4243this == null || listM4243this.isEmpty()) {
            return;
        }
        int i2 = ((C15012l) AbstractC16901l.m4231native(listM4243this)).crashlytics;
        C16761l c16761l = AbstractC7124l.yandex;
        C16761l c16761l2 = new C16761l(1);
        c16761l2.yandex(i2);
        int size2 = listM4243this.size();
        for (int i3 = 1; i3 < size2; i3++) {
            C15012l c15012l2 = (C15012l) listM4243this.get(i3);
            while (c16761l2.loadAd != 0) {
                int iAmazon = c16761l2.amazon();
                if (c15012l2.loadAd < iAmazon) {
                    int i4 = c15012l2.crashlytics;
                    if (i4 > iAmazon) {
                        AbstractC1786l.yandex("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iAmazon);
                        break;
                    }
                    break;
                }
                c16761l2.purchase(c16761l2.loadAd - 1);
            }
            c16761l2.yandex(c15012l2.crashlytics);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f7563l.charAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final C3625l subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            AbstractC1786l.yandex("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.f7563l;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C3625l c3625l = AbstractC0255l.yandex;
        if (i > i2) {
            AbstractC1786l.yandex("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.f7564l;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C15012l c15012l = (C15012l) list.get(i3);
                int i4 = c15012l.loadAd;
                int i5 = c15012l.crashlytics;
                if (AbstractC0255l.loadAd(i, i2, i4, i5)) {
                    arrayList.add(new C15012l(Math.max(i, c15012l.loadAd) - i, Math.min(i2, i5) - i, c15012l.yandex, c15012l.amazon));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new C3625l(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3625l)) {
            return false;
        }
        C3625l c3625l = (C3625l) obj;
        return AbstractC8576l.yandex(this.f7563l, c3625l.f7563l) && AbstractC8576l.yandex(this.f7564l, c3625l.f7564l);
    }

    public final int hashCode() {
        int iHashCode = this.f7563l.hashCode() * 31;
        List list = this.f7564l;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7563l.length();
    }

    public final C3625l loadAd(Function1 function1) {
        C18734l c18734l = new C18734l(this);
        ArrayList arrayList = c18734l.f36516l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15012l c15012l = (C15012l) function1.invoke(((C4253l) arrayList.get(i)).yandex(RecyclerView.UNDEFINED_DURATION));
            arrayList.set(i, new C4253l(c15012l.loadAd, c15012l.crashlytics, c15012l.yandex, c15012l.amazon));
        }
        return c18734l.billing();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7563l;
    }

    public final List yandex(int i) {
        List list = this.f7564l;
        if (list == null) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            C15012l c15012l = (C15012l) obj;
            if ((c15012l.yandex instanceof AbstractC12494l) && AbstractC0255l.loadAd(0, i, c15012l.loadAd, c15012l.crashlytics)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ C3625l(String str) {
        this(str, C2580l.f5619l);
    }

    public C3625l(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
