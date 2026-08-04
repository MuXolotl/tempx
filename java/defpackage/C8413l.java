package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: lًۦّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8413l extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8413l(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException, int i2) {
        switch (i2) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Locale locale = Locale.US;
                StringBuilder sbSignature = AbstractC0653l.Signature(j, "Pos: ", ", limit: ");
                sbSignature.append(j2);
                sbSignature.append(", len: ");
                sbSignature.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbSignature.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale2 = Locale.US;
                StringBuilder sbSignature2 = AbstractC0653l.Signature(j, "Pos: ", ", limit: ");
                sbSignature2.append(j2);
                sbSignature2.append(", len: ");
                sbSignature2.append(i);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbSignature2.toString()), indexOutOfBoundsException);
                break;
        }
    }

    public /* synthetic */ C8413l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C8413l(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        super(sb.toString());
    }

    public C8413l(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }

    public C8413l(IOException iOException, Object... objArr) {
        super(String.format(Locale.getDefault(), "Cannot modify %s because do not have permissions to create files in the folder", objArr), iOException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8413l(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbSignature = AbstractC0653l.Signature(i, "Pos: ", ", limit: ");
        sbSignature.append(i2);
        sbSignature.append(", len: ");
        sbSignature.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbSignature.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8413l(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i) {
            case 15:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }
}
