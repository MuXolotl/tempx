package defpackage;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔۥٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3025l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f6536l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8050l f6537l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6538l = 1;

    public /* synthetic */ C3025l(C8050l c8050l, int i, int i2) {
        this.f6537l = c8050l;
        this.f6536l = i;
    }

    private final Object billing() {
        C8050l c8050l = this.f6537l;
        int i = this.f6536l;
        c8050l.f16774l.getClass();
        synchronized (c8050l) {
            c8050l.f16766l.remove(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    private final Object yandex() {
        C8050l c8050l = this.f6537l;
        int i = this.f6536l;
        c8050l.f16774l.getClass();
        try {
            c8050l.f16777l.isVip(i, 9);
            synchronized (c8050l) {
                c8050l.f16766l.remove(Integer.valueOf(i));
                Unit unit = Unit.INSTANCE;
            }
        } catch (IOException unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6538l) {
            case 0:
                return yandex();
            case 1:
                return billing();
            default:
                C8050l c8050l = this.f6537l;
                int i = this.f6536l;
                c8050l.f16774l.getClass();
                try {
                    c8050l.f16777l.isVip(i, 9);
                    synchronized (c8050l) {
                        c8050l.f16766l.remove(Integer.valueOf(i));
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (IOException unused) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3025l(C8050l c8050l, int i, List list) {
        this.f6537l = c8050l;
        this.f6536l = i;
    }

    public /* synthetic */ C3025l(C8050l c8050l, int i, List list, boolean z) {
        this.f6537l = c8050l;
        this.f6536l = i;
    }
}
