package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٓٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14259l implements InterfaceC2167l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Double f27857l;

    public C14259l(Double d) {
        if (d == null) {
            this.f27857l = Double.valueOf(Double.NaN);
        } else {
            this.f27857l = d;
        }
    }

    @Override // defpackage.InterfaceC2167l
    public final Iterator amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC2167l
    public final Boolean billing() {
        Double d = this.f27857l;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14259l) {
            return this.f27857l.equals(((C14259l) obj).f27857l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27857l.hashCode();
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return new C14259l(this.f27857l);
    }

    @Override // defpackage.InterfaceC2167l
    public final String mopub() {
        Double d = this.f27857l;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // defpackage.InterfaceC2167l
    public final Double remoteconfig() {
        return this.f27857l;
    }

    @Override // defpackage.InterfaceC2167l
    public final InterfaceC2167l smaato(String str, C7502l c7502l, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C13997l(mopub());
        }
        throw new IllegalArgumentException(mopub() + "." + str + " is not a function.");
    }

    public final String toString() {
        return mopub();
    }
}
