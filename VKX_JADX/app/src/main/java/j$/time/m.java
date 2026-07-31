package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new m(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new m(localTime2, zoneOffset2);
    }

    public m(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.C(temporalField);
        }
        return temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.e) {
            return this.b;
        }
        if (((temporalQuery == j$.time.temporal.p.a) || (temporalQuery == j$.time.temporal.p.b)) || temporalQuery == j$.time.temporal.p.f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this.a;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final m d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? O(this.a.d(j, qVar), this.b) : (m) qVar.j(this, j);
    }

    public final m O(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new m(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (m) temporalField.C(this, j);
        }
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (temporalField != chronoField) {
            return O(localTime.c(j, temporalField), this.b);
        }
        ChronoField chronoField2 = (ChronoField) temporalField;
        return O(localTime, ZoneOffset.ofTotalSeconds(chronoField2.b.a(j, chronoField2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        boolean zEquals = this.b.equals(mVar.b);
        LocalTime localTime = this.a;
        if (zEquals) {
            return localTime.compareTo(mVar.a);
        }
        int iCompare = Long.compare(localTime.X() - (((long) this.b.getTotalSeconds()) * 1000000000), mVar.a.X() - (((long) mVar.b.getTotalSeconds()) * 1000000000));
        return iCompare == 0 ? this.a.compareTo(mVar.a) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N() || temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a.equals(mVar.a) && this.b.equals(mVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        localDate.getClass();
        return (m) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return ((ChronoField) temporalField).b;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.p.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a.X(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, aVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, aVar);
    }
}
