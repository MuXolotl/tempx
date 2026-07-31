package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍؘُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5599l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f11892l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5599l(int i) {
        super(9);
        this.f11892l = i;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٍۤٙ */
    public final Object mo219l(Object obj) {
        switch (this.f11892l) {
            case 0:
                C7854l c7854lCrashlytics = C7854l.crashlytics();
                return new C4845l(c7854lCrashlytics.loadAd(), (C6664l) c7854lCrashlytics.yandex(C6664l.class), new C7774l(C7854l.crashlytics().loadAd(), (C4434l) obj));
            case 1:
                C7854l c7854lCrashlytics2 = C7854l.crashlytics();
                Context contextLoadAd = C7854l.crashlytics().loadAd();
                ArrayList arrayList = new ArrayList();
                C6760l c6760l = new C6760l(25);
                C16529l c16529l = C16529l.purchase;
                C4225l.loadAd(contextLoadAd);
                C4225l.yandex().crashlytics(c16529l);
                C16529l.amazon.contains(new C7017l("json"));
                arrayList.add(c6760l);
                return new C11734l(c7854lCrashlytics2.loadAd(), (C6664l) c7854lCrashlytics2.yandex(C6664l.class));
            default:
                C17413l c17413l = (C17413l) obj;
                C7854l c7854lCrashlytics3 = C7854l.crashlytics();
                return new C17781l(c7854lCrashlytics3.loadAd(), (C6664l) c7854lCrashlytics3.yandex(C6664l.class), new C5694l(C7854l.crashlytics().loadAd(), c17413l), c17413l.yandex);
        }
    }
}
