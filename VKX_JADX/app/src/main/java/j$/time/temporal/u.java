package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final h h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final DayOfWeek a;
    public final int b;
    public final transient t c;
    public final transient t d;
    public final transient t e;
    public final transient t f;

    static {
        new u(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        h = i.d;
    }

    public u(DayOfWeek dayOfWeek, int i) {
        a aVar = a.DAYS;
        a aVar2 = a.WEEKS;
        this.c = new t("DayOfWeek", this, aVar, aVar2, t.f);
        this.d = new t("WeekOfMonth", this, aVar2, a.MONTHS, t.g);
        h hVar = i.d;
        this.e = new t("WeekOfWeekBasedYear", this, aVar2, hVar, t.i);
        this.f = new t("WeekBasedYear", this, hVar, a.FOREVER, ChronoField.YEAR.b);
        Objects.a(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            j$.time.d.c("Minimal number of days is invalid");
            throw null;
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u a(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        u uVar = (u) concurrentHashMap.get(str);
        if (uVar != null) {
            return uVar;
        }
        concurrentHashMap.putIfAbsent(str, new u(dayOfWeek, i));
        return (u) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
