package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13991l implements Closeable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function0 f27298l = new C7282l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f27297l = new ArrayList();
    private volatile /* synthetic */ long oldestCookie = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4910l f27296l = AbstractC8618l.yandex();

    public static Long vip(C13325l c13325l, long j) {
        Integer num = c13325l.f26148l;
        if (num != null) {
            return Long.valueOf((((long) num.intValue()) * 1000) + j);
        }
        C8485l c8485l = c13325l.f26147l;
        if (c8485l != null) {
            return Long.valueOf(c8485l.f17540l);
        }
        return null;
    }

    public final void billing(long j) {
        AbstractC3984l.ad(this.f27297l, new C4199l(this, j));
        long jMin = Long.MAX_VALUE;
        for (C1883l c1883l : this.f27297l) {
            Long lVip = vip(c1883l.yandex, c1883l.loadAd);
            if (lVip != null) {
                jMin = Math.min(jMin, lVip.longValue());
            }
        }
        this.oldestCookie = jMin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable mopub(C2540l c2540l, AbstractC0283l abstractC0283l) {
        C18166l c18166l;
        C4910l c4910l;
        if (abstractC0283l instanceof C18166l) {
            c18166l = (C18166l) abstractC0283l;
            int i = c18166l.f35563l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18166l.f35563l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18166l = new C18166l(this, abstractC0283l);
            }
        } else {
            c18166l = new C18166l(this, abstractC0283l);
        }
        Object obj = c18166l.f35566l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c18166l.f35563l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c4910l = this.f27296l;
            c18166l.f35565l = c2540l;
            c18166l.f35564l = c4910l;
            c18166l.f35563l = 1;
            if (c4910l.yandex(c18166l) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4910l c4910l2 = c18166l.f35564l;
            C2540l c2540l2 = c18166l.f35565l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            c2540l = c2540l2;
        }
        try {
            long jLongValue = ((Number) this.f27298l.invoke()).longValue();
            if (jLongValue >= this.oldestCookie) {
                billing(jLongValue);
            }
            ArrayList arrayList = this.f27297l;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (AbstractC12359l.crashlytics(((C1883l) obj2).yandex, c2540l)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C1883l) it.next()).yandex);
            }
            return arrayList3;
        } finally {
            c4910l.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(C2540l c2540l, C13325l c13325l, AbstractC0283l abstractC0283l) {
        C17244l c17244l;
        C4910l c4910l;
        if (abstractC0283l instanceof C17244l) {
            c17244l = (C17244l) abstractC0283l;
            int i = c17244l.f33467l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17244l.f33467l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17244l = new C17244l(this, abstractC0283l);
            }
        } else {
            c17244l = new C17244l(this, abstractC0283l);
        }
        Object obj = c17244l.f33463l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c17244l.f33467l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (AbstractC12024l.m3315catch(c13325l.f26145l)) {
                return Unit.INSTANCE;
            }
            c4910l = this.f27296l;
            c17244l.f33466l = c2540l;
            c17244l.f33465l = c13325l;
            c17244l.f33468l = c4910l;
            c17244l.f33467l = 1;
            if (c4910l.yandex(c17244l) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4910l c4910l2 = c17244l.f33468l;
            c13325l = c17244l.f33465l;
            C2540l c2540l2 = c17244l.f33466l;
            AbstractC2829l.crashlytics(obj);
            c4910l = c4910l2;
            c2540l = c2540l2;
        }
        try {
            AbstractC3984l.ad(this.f27297l, new C0464l(c13325l, c2540l, 4));
            long jLongValue = ((Number) this.f27298l.invoke()).longValue();
            ArrayList arrayList = this.f27297l;
            String str = c13325l.f26142l;
            C13325l c13325lYandex = (str == null || !AbstractC16648l.isVip(str, "/", false)) ? C13325l.yandex(c13325l, null, (String) c2540l.f5534l.getValue(), 959) : c13325l;
            String str2 = c13325lYandex.f26150l;
            if (str2 == null || AbstractC12024l.m3315catch(str2)) {
                c13325lYandex = C13325l.yandex(c13325lYandex, c2540l.f5529l, null, 991);
            }
            arrayList.add(new C1883l(c13325lYandex, jLongValue));
            Long lVip = vip(c13325l, jLongValue);
            if (lVip != null) {
                long jLongValue2 = lVip.longValue();
                if (this.oldestCookie > jLongValue2) {
                    this.oldestCookie = jLongValue2;
                }
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        } finally {
            c4910l.billing(null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
