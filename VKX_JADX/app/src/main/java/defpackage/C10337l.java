package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10337l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f21055l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f21056l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f21057l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C4910l f21058l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C11528l f21059l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f21060l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C11528l f21061l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ long f21062l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10337l(long j, InterfaceC14029l interfaceC14029l, C11528l c11528l, CharSequence charSequence) {
        super(2, interfaceC14029l);
        this.f21057l = charSequence;
        this.f21062l = j;
        this.f21059l = c11528l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        long j;
        C18436l c18436l;
        C11528l c11528l;
        C4910l c4910l;
        int i = this.f21056l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            TextClassifier textClassifierPurchase = C18073l.purchase(this.f21060l);
            long j2 = this.f21062l;
            int iMopub = C12814l.mopub(j2);
            int iBilling = C12814l.billing(j2);
            CharSequence charSequence = this.f21057l;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iMopub, iBilling);
            C11528l c11528l2 = this.f21059l;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(c11528l2.amazon());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierPurchase.suggestSelection(defaultLocales.build());
            long jLoadAd = AbstractC2296l.loadAd(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f21055l = jLoadAd;
                this.f21056l = 2;
                if (C11528l.yandex(c11528l2, this.f21057l, jLoadAd, textClassifierPurchase, this) != enumC9342l) {
                    j = jLoadAd;
                }
            } else {
                C18436l c18436lCrashlytics = c11528l2.crashlytics(charSequence, jLoadAd, textSelectionSuggestSelection.getTextClassification());
                C4910l c4910l2 = c11528l2.purchase;
                this.f21060l = c18436lCrashlytics;
                this.f21058l = c4910l2;
                this.f21061l = c11528l2;
                this.f21055l = jLoadAd;
                this.f21056l = 1;
                if (c4910l2.yandex(this) != enumC9342l) {
                    c18436l = c18436lCrashlytics;
                    c11528l = c11528l2;
                    c4910l = c4910l2;
                    j = jLoadAd;
                    c11528l.mopub.setValue(c18436l);
                    Unit unit = Unit.INSTANCE;
                }
            }
            return enumC9342l;
        }
        if (i == 1) {
            j = this.f21055l;
            c11528l = this.f21061l;
            c4910l = this.f21058l;
            c18436l = (C18436l) this.f21060l;
            AbstractC2829l.crashlytics(obj);
            try {
                c11528l.mopub.setValue(c18436l);
                Unit unit2 = Unit.INSTANCE;
            } finally {
                c4910l.billing(null);
            }
        } else {
            if (i != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f21055l;
            AbstractC2829l.crashlytics(obj);
        }
        return new C12814l(j);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C10337l c10337l = new C10337l(this.f21062l, interfaceC14029l, this.f21059l, this.f21057l);
        c10337l.f21060l = obj;
        return c10337l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10337l) ads((InterfaceC14029l) obj2, C18073l.purchase(obj))).Signature(Unit.INSTANCE);
    }
}
