package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: lٓٚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14243l implements Comparator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f27840l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f27841l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27842l = 0;

    public C14243l(Rational rational, Rational rational2) {
        this.f27840l = rational2 == null ? new Rational(4, 3) : rational2;
        this.f27841l = loadAd(rational);
    }

    public static float yandex(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f27842l;
        Object obj3 = this.f27841l;
        boolean z = false;
        switch (i) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj3;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFLoadAd = loadAd(rational);
                RectF rectFLoadAd2 = loadAd(rational2);
                boolean z2 = rectFLoadAd.width() >= rectF.width() && rectFLoadAd.height() >= rectF.height();
                if (rectFLoadAd2.width() >= rectF.width() && rectFLoadAd2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((rectFLoadAd.height() * rectFLoadAd.width()) - (rectFLoadAd2.height() * rectFLoadAd2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(yandex(rectFLoadAd, rectF) - yandex(rectFLoadAd2, rectF)));
            default:
                InterfaceC2167l interfaceC2167l = (InterfaceC2167l) obj;
                InterfaceC2167l interfaceC2167l2 = (InterfaceC2167l) obj2;
                if (interfaceC2167l instanceof C10910l) {
                    return !(interfaceC2167l2 instanceof C10910l) ? 1 : 0;
                }
                if (interfaceC2167l2 instanceof C10910l) {
                    return -1;
                }
                AbstractC10453l abstractC10453l = (AbstractC10453l) obj3;
                return abstractC10453l == null ? interfaceC2167l.mopub().compareTo(interfaceC2167l2.mopub()) : (int) AbstractC13831l.smaato(abstractC10453l.yandex((C7502l) this.f27840l, Arrays.asList(interfaceC2167l, interfaceC2167l2)).remoteconfig().doubleValue());
        }
    }

    public RectF loadAd(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.f27840l;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    public C14243l(AbstractC10453l abstractC10453l, C7502l c7502l) {
        this.f27841l = abstractC10453l;
        this.f27840l = c7502l;
    }
}
