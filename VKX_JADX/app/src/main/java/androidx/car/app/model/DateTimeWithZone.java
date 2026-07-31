package androidx.car.app.model;

import android.annotation.SuppressLint;
import defpackage.AbstractC0653l;
import defpackage.C8339l;
import defpackage.InterfaceC12208l;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.TextStyle;
import j$.util.Objects;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = 64800;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;
    private final String mZoneShortName;

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    public static DateTimeWithZone create(long j, int i, String str) {
        if (j < 0) {
            C8339l.metrica("Time since epoch must be greater than or equal to zero");
            return null;
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            C8339l.metrica("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        Objects.requireNonNull(str);
        if (!str.isEmpty()) {
            return new DateTimeWithZone(j, i, str);
        }
        C8339l.metrica("The time zone short name can not be null or empty");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    @SuppressLint({"MethodNameUnits"})
    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[time since epoch (ms): ");
        sb.append(this.mTimeSinceEpochMillis);
        sb.append("( ");
        sb.append(new Date(this.mTimeSinceEpochMillis));
        sb.append(")  zone offset (s): ");
        sb.append(this.mZoneOffsetSeconds);
        sb.append(", zone: ");
        return AbstractC0653l.ads(sb, this.mZoneShortName, "]");
    }

    private DateTimeWithZone(long j, int i, String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    public static DateTimeWithZone create(long j, TimeZone timeZone) {
        if (j >= 0) {
            Objects.requireNonNull(timeZone);
            return create(j, (int) (((long) timeZone.getOffset(j)) / 1000), timeZone.getDisplayName(false, 0));
        }
        C8339l.metrica("timeSinceEpochMillis must be greater than or equal to zero");
        return null;
    }

    public static DateTimeWithZone create(ZonedDateTime zonedDateTime) {
        Objects.requireNonNull(zonedDateTime);
        LocalDateTime localDateTime = zonedDateTime.p();
        ZoneId zone = zonedDateTime.getZone();
        ZoneOffset offset = zone.getRules().getOffset(localDateTime);
        return create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
    }
}
