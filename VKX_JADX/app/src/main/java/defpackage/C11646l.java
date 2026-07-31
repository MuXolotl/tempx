package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lِؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11646l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1774l f23363l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23364l;

    public /* synthetic */ C11646l(C1774l c1774l, int i) {
        this.f23364l = i;
        this.f23363l = c1774l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f23364l;
        C1774l c1774l = this.f23363l;
        switch (i) {
            case 0:
                c1774l.m4125private(new C9434l(1));
                break;
            case 1:
                c1774l.m4125private(new C9434l(4));
                break;
            case 2:
                c1774l.m4125private(new C15191l((String) null, 3));
                break;
            case 3:
                c1774l.m4125private(new C7721l());
                break;
            case 4:
                ((AppActivity) c1774l.isVip()).f36637l.amazon(C1722l.f4118l);
                break;
            case 5:
                c1774l.m4125private(new C9455l());
                break;
            case 6:
                c1774l.m4125private(new C9434l(0));
                break;
            case 7:
                c1774l.m4125private(new C9434l(2));
                break;
            case 8:
                new C7883l().Signature(c1774l.isVip());
                break;
            case 9:
                new C1930l().Signature(c1774l.isVip());
                break;
            case 10:
                AbstractC1213l.billing(c1774l.isVip(), new C7679l());
                break;
            case 11:
                C16287l c16287l = C16287l.yandex;
                Activity activityIsVip = c1774l.isVip();
                c16287l.getClass();
                C16287l.purchase(activityIsVip);
                break;
            case 12:
                c1774l.m4125private(new C7659l());
                break;
            case 13:
                c1774l.m4125private(new C1050l(0));
                break;
            default:
                c1774l.m4125private(new C9434l(3));
                break;
        }
        return Unit.INSTANCE;
    }
}
