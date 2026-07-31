package j$.time.format;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final j f(Locale locale) {
        j$.time.temporal.t tVar;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.u.g;
        Objects.a(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.u uVarA = j$.time.temporal.u.a(DayOfWeek.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            tVar = uVarA.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.t tVar2 = uVarA.f;
                int i = this.h;
                if (i == 2) {
                    return new p(tVar2, 2, 2, p.h, this.e);
                }
                return new j(tVar2, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                tVar = uVarA.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                tVar = uVarA.e;
            }
        }
        return new j(tVar, this.b, this.c, SignStyle.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        return f(xVar.b.b).j(xVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).k(vVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
