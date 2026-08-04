package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٕٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15684l {
    public static C3797l loadAd;
    public static final C2351l yandex = new C2351l(15);

    public static final int amazon(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iSubs = AbstractC8576l.subs(((C4503l) list.get(i3)).loadAd, i);
            if (iSubs < 0) {
                i2 = i3 + 1;
            } else {
                if (iSubs <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void billing(C13006l c13006l, int i, Object obj) {
        int iAdmob = c13006l.admob(i);
        Object[] objArr = c13006l.crashlytics;
        Object obj2 = objArr[iAdmob];
        objArr[iAdmob] = C1867l.yandex;
        if (obj == obj2) {
            return;
        }
        AbstractC2032l.yandex("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void crashlytics(C5296l c5296l, ArrayList arrayList, int i) {
        boolean zSmaato = c5296l.smaato(i);
        int[] iArr = c5296l.loadAd;
        if (zSmaato) {
            arrayList.add(c5296l.vip(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            crashlytics(c5296l, arrayList, i3);
        }
    }

    public static final void loadAd(long j, EnumC7283l enumC7283l) {
        if (enumC7283l == EnumC7283l.f15126l) {
            if (C15519l.mopub(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC14825l.crashlytics("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C15519l.admob(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC14825l.crashlytics("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final /* synthetic */ C13568l mopub(View view, Object obj) {
        return new C13568l(obj, new C13932l(6, view));
    }

    public static final C11033l purchase(Object... objArr) {
        if (objArr.length == 0) {
            return new C11033l();
        }
        C11033l c11033l = new C11033l();
        AbstractC3984l.pro(c11033l, objArr);
        return c11033l;
    }

    public static final void yandex(int i, int i2, List list) {
        int iAmazon = amazon(i, list);
        if (iAmazon < 0) {
            iAmazon = -(iAmazon + 1);
        }
        while (iAmazon < list.size() && ((C4503l) list.get(iAmazon)).loadAd < i2) {
        }
    }
}
