package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: lٍٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9600l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f19555l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19556l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19557l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19558l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f19559l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f19560l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f19561l;

    public /* synthetic */ RunnableC9600l(C9716l c9716l, C13572l c13572l, AbstractC1186l abstractC1186l, C0743l c0743l, boolean z, C5807l c5807l) {
        this.f19558l = 0;
        this.f19555l = c9716l;
        this.f19560l = c13572l;
        this.f19559l = abstractC1186l;
        this.f19561l = c0743l;
        this.f19557l = z;
        this.f19556l = c5807l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5807l c5807l;
        int i = this.f19558l;
        Object obj = this.f19556l;
        Object obj2 = this.f19561l;
        Object obj3 = this.f19559l;
        Object obj4 = this.f19560l;
        Object obj5 = this.f19555l;
        switch (i) {
            case 0:
                C9716l c9716l = (C9716l) obj5;
                C13572l c13572l = (C13572l) obj4;
                AbstractC1186l abstractC1186l = (AbstractC1186l) obj3;
                C0743l c0743l = (C0743l) obj2;
                boolean z = this.f19557l;
                C5807l c5807l2 = (C5807l) obj;
                try {
                    C16543l c16543lYandex = c9716l.f19811l.yandex(c13572l, abstractC1186l, c9716l.f19804l, c0743l);
                    ExecutorC12010l executorC12010l = c9716l.f19808l;
                    c5807l = c5807l2;
                    try {
                        executorC12010l.execute(new RunnableC3009l(c9716l, c13572l, c16543lYandex, z, c5807l));
                    } catch (RuntimeException e) {
                        e = e;
                        c5807l.amazon(e);
                        return;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    c5807l = c5807l2;
                }
                break;
            case 1:
                Pair pair = (Pair) obj4;
                ((C17505l) ((C7065l) obj5).f14805l.subs).ad(((Integer) pair.first).intValue(), (C5019l) pair.second, (C13071l) obj3, (C2040l) obj2, (IOException) obj, this.f19557l);
                break;
            default:
                C10418l c10418l = (C10418l) obj5;
                C3716l c3716l = (C3716l) obj4;
                InterfaceC18690l interfaceC18690l = (InterfaceC18690l) obj3;
                C11550l c11550l = (C11550l) obj2;
                EnumC8920l enumC8920l = (EnumC8920l) obj;
                if (interfaceC18690l == c10418l.amazon()) {
                    c10418l.ad = c3716l.amazon(interfaceC18690l, true);
                    c11550l.getClass();
                    InterfaceC14105l interfaceC14105l = (InterfaceC14105l) AbstractC4338l.firebase(c11550l, C11550l.f23223l);
                    Objects.requireNonNull(interfaceC14105l);
                    interfaceC14105l.admob(c10418l.ad, enumC8920l, this.f19557l);
                    c10418l.m2923switch();
                }
                break;
        }
    }

    public /* synthetic */ RunnableC9600l(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, int i) {
        this.f19558l = i;
        this.f19555l = obj;
        this.f19560l = obj2;
        this.f19559l = obj3;
        this.f19561l = obj4;
        this.f19556l = serializable;
        this.f19557l = z;
    }
}
